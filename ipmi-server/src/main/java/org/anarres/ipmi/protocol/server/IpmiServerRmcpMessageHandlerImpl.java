package org.anarres.ipmi.protocol.server;

import javax.annotation.Nonnull;

import org.anarres.ipmi.protocol.client.session.IpmiPacketContext;
import org.anarres.ipmi.protocol.client.session.IpmiSession;
import org.anarres.ipmi.protocol.client.visitor.IpmiClientRmcpMessageHandler;
import org.anarres.ipmi.protocol.client.visitor.IpmiHandlerContext;
import org.anarres.ipmi.protocol.packet.asf.AsfRmcpData;
import org.anarres.ipmi.protocol.packet.ipmi.IpmiSessionWrapper;
import org.anarres.ipmi.protocol.packet.ipmi.command.IpmiCommand;
import org.anarres.ipmi.protocol.packet.ipmi.payload.IpmiPayload;
import org.anarres.ipmi.protocol.packet.rmcp.OEMRmcpMessage;
import org.anarres.ipmi.protocol.packet.rmcp.RmcpData;
import org.anarres.ipmi.protocol.server.dispatch.IpmiPayloadReceiveDispatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Preconditions;

public class IpmiServerRmcpMessageHandlerImpl extends IpmiClientRmcpMessageHandler.Adapter {
    private static final Logger LOG = LoggerFactory.getLogger(IpmiPayloadReceiveDispatcher.class);
    
	private final IpmiPacketContext sessionManager;
	private final IpmiServerIpmiPayloadHandlerImpl ipmiPayloadHandler;

	private IpmiServerAsfMessageHandlerImpl asfMessageHandler;
	private IpmiServerIpmiCommandHandlerImpl ipmiCommandHandler;
	
	public IpmiServerRmcpMessageHandlerImpl(@Nonnull IpmiPacketContext sessionManager,
			IpmiServerIpmiPayloadHandlerImpl ipmiPayloadHandler,
			IpmiServerAsfMessageHandlerImpl asfMessageHandler, 
			IpmiServerIpmiCommandHandlerImpl ipmiCommandHandler) {
		this.sessionManager = sessionManager;
		this.ipmiPayloadHandler = ipmiPayloadHandler;
		this.asfMessageHandler = asfMessageHandler;
		this.ipmiCommandHandler = ipmiCommandHandler;
	}

	@Override
	public void handleAsfRmcpData(IpmiHandlerContext context, AsfRmcpData message) {
		message.apply(asfMessageHandler, context);
	}

	@Override
	public void handleIpmiRmcpData(IpmiHandlerContext context, IpmiSessionWrapper message) {
		IpmiPayload payload = message.getIpmiPayload();
		if(payload instanceof IpmiCommand) {
			IpmiCommand command = (IpmiCommand) payload;
			command.apply(ipmiCommandHandler, context);
		} else {
			throw new UnsupportedOperationException("Not implemented.");
		}
	}

	@Override
	public void handleOemRmcpData(IpmiHandlerContext context, OEMRmcpMessage message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

    @Override
    public void handleDefault(IpmiHandlerContext context, RmcpData message) {
    	Preconditions.checkNotNull(message, "Message was null.");
        LOG.warn("Discarded:\n" + message); 
    }
}
