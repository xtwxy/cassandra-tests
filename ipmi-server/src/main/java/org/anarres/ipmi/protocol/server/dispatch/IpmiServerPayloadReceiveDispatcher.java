/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.server.dispatch;

import javax.annotation.Nonnull;

import org.anarres.ipmi.protocol.client.session.IpmiPacketContext;
import org.anarres.ipmi.protocol.client.visitor.IpmiHandlerContext;
import org.anarres.ipmi.protocol.packet.rmcp.Packet;
import org.anarres.ipmi.protocol.server.IpmiServerAsfMessageHandlerImpl;
import org.anarres.ipmi.protocol.server.IpmiServerIpmiPayloadHandlerImpl;
import org.anarres.ipmi.protocol.server.IpmiServerRmcpMessageHandlerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author shevek
 */
public class IpmiServerPayloadReceiveDispatcher {

	private static final Logger LOG = LoggerFactory.getLogger(IpmiServerPayloadReceiveDispatcher.class);

	/**
	 * [IPMI2] Section 6.12.15, page 60: Session inactivity timeout is 60
	 * seconds +/-3 seconds.
	 */
	private final IpmiPacketContext sessionManager;
	private IpmiServerRmcpMessageHandlerImpl rmcpHandler;

	public IpmiServerPayloadReceiveDispatcher(@Nonnull IpmiPacketContext sessionManager) {
		this.sessionManager = sessionManager;
	}

	public void setIpmiPayloadHandler(IpmiServerIpmiPayloadHandlerImpl ipmiPayloadHandler,
			IpmiServerAsfMessageHandlerImpl asfMessageHandler) {
		this.rmcpHandler = new IpmiServerRmcpMessageHandlerImpl(sessionManager, ipmiPayloadHandler, asfMessageHandler);
	}

	public void dispatch(@Nonnull IpmiHandlerContext context, @Nonnull Packet packet) {
		LOG.debug(packet.toString());
		packet.apply(rmcpHandler, context);
	}
}
