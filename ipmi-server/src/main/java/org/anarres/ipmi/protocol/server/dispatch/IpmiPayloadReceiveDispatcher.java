/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.server.dispatch;

import java.util.concurrent.TimeUnit;

import javax.annotation.Nonnull;

import org.anarres.ipmi.protocol.client.dispatch.IpmiReceiver;
import org.anarres.ipmi.protocol.client.dispatch.IpmiReceiverKey;
import org.anarres.ipmi.protocol.client.dispatch.IpmiReceiverRepository;
import org.anarres.ipmi.protocol.client.session.IpmiPacketContext;
import org.anarres.ipmi.protocol.client.visitor.IpmiHandlerContext;
import org.anarres.ipmi.protocol.packet.ipmi.payload.IpmiPayload;
import org.anarres.ipmi.protocol.packet.rmcp.Packet;
import org.anarres.ipmi.protocol.server.IpmiServerAsfMessageHandlerImpl;
import org.anarres.ipmi.protocol.server.IpmiServerIpmiCommandHandlerImpl;
import org.anarres.ipmi.protocol.server.IpmiServerIpmiPayloadHandlerImpl;
import org.anarres.ipmi.protocol.server.IpmiServerRmcpMessageHandlerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

/**
 *
 * @author shevek
 */
public class IpmiPayloadReceiveDispatcher implements IpmiReceiverRepository {

	private static final Logger LOG = LoggerFactory.getLogger(IpmiPayloadReceiveDispatcher.class);

	/**
	 * [IPMI2] Section 6.12.15, page 60: Session inactivity timeout is 60
	 * seconds +/-3 seconds.
	 */
	private final Cache<IpmiReceiverKey, IpmiReceiver> ipmiReceivers;
	private final IpmiPacketContext sessionManager;
	private IpmiServerRmcpMessageHandlerImpl rmcpHandler;

	public IpmiPayloadReceiveDispatcher(@Nonnull IpmiPacketContext sessionManager) {
		this.sessionManager = sessionManager;
		this.ipmiReceivers = CacheBuilder.newBuilder()
				// .maximumSize(64)
				.expireAfterWrite(180, TimeUnit.SECONDS)
				.removalListener(new RemovalListener<IpmiReceiverKey, IpmiReceiver>() {

					@Override
					public void onRemoval(RemovalNotification<IpmiReceiverKey, IpmiReceiver> notification) {
						IpmiReceiverKey key = notification.getKey();
						IpmiReceiver receiver = notification.getValue();
						if (key != null && receiver != null && notification.wasEvicted())
							receiver.timeout(key);
					}
				}).recordStats().build();
	}

	public void setIpmiPayloadHandler(IpmiServerIpmiPayloadHandlerImpl ipmiPayloadHandler,
			IpmiServerAsfMessageHandlerImpl asfMessageHandler, IpmiServerIpmiCommandHandlerImpl ipmiCommandHandler) {
		this.rmcpHandler = new IpmiServerRmcpMessageHandlerImpl(sessionManager, ipmiPayloadHandler, asfMessageHandler,
				ipmiCommandHandler);
	}

	@Override
	public IpmiReceiver getReceiver(@Nonnull IpmiHandlerContext context, Class<? extends IpmiPayload> payloadType,
			byte messageId) {
		IpmiReceiverKey key = new IpmiReceiverKey(context.getSystemAddress(), payloadType, messageId);
		IpmiReceiver receiver = ipmiReceivers.asMap().remove(key);
		if (LOG.isDebugEnabled())
			LOG.debug("Get: " + key + " -> " + receiver);
		return receiver;
	}

	@Override
	public void setReceiver(@Nonnull IpmiReceiverKey key, @Nonnull IpmiReceiver receiver) {
		if (LOG.isDebugEnabled())
			LOG.debug("Set: " + key + " -> " + receiver);
		ipmiReceivers.put(key, receiver);
	}

	@VisibleForTesting
	protected void handleDiscard(@Nonnull IpmiHandlerContext context, @Nonnull Object message) {
		Preconditions.checkNotNull(message, "Message was null.");
		LOG.warn("Discarded:\n" + message);
	}

	public void dispatch(@Nonnull IpmiHandlerContext context, @Nonnull Packet packet) {
		packet.apply(rmcpHandler, context);
	}
}
