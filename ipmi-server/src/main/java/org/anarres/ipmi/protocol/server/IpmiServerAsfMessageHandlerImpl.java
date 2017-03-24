package org.anarres.ipmi.protocol.server;

import javax.annotation.Nonnull;

import org.anarres.ipmi.protocol.client.dispatch.IpmiPayloadTransmitQueue.IpmiPacketSender;
import org.anarres.ipmi.protocol.client.visitor.IpmiClientAsfMessageHandler;
import org.anarres.ipmi.protocol.client.visitor.IpmiHandlerContext;
import org.anarres.ipmi.protocol.packet.asf.AsfCapabilitiesRequestData;
import org.anarres.ipmi.protocol.packet.asf.AsfCapabilitiesResponseData;
import org.anarres.ipmi.protocol.packet.asf.AsfCloseSessionRequestData;
import org.anarres.ipmi.protocol.packet.asf.AsfCloseSessionResponseData;
import org.anarres.ipmi.protocol.packet.asf.AsfOpenSessionRequestData;
import org.anarres.ipmi.protocol.packet.asf.AsfOpenSessionResponseData;
import org.anarres.ipmi.protocol.packet.asf.AsfPowerCycleResetData;
import org.anarres.ipmi.protocol.packet.asf.AsfPowerUpData;
import org.anarres.ipmi.protocol.packet.asf.AsfPresencePingData;
import org.anarres.ipmi.protocol.packet.asf.AsfPresencePongData;
import org.anarres.ipmi.protocol.packet.asf.AsfRAKPMessage1Data;
import org.anarres.ipmi.protocol.packet.asf.AsfRAKPMessage2Data;
import org.anarres.ipmi.protocol.packet.asf.AsfRAKPMessage3Data;
import org.anarres.ipmi.protocol.packet.asf.AsfResetData;
import org.anarres.ipmi.protocol.packet.asf.AsfSystemStateRequestData;
import org.anarres.ipmi.protocol.packet.asf.AsfSystemStateResponseData;
import org.anarres.ipmi.protocol.packet.asf.AsfUnconditionalPowerDownData;
import org.anarres.ipmi.protocol.packet.rmcp.RmcpPacket;
import org.anarres.ipmi.protocol.server.dispatch.IpmiPayloadReceiveDispatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IpmiServerAsfMessageHandlerImpl extends IpmiClientAsfMessageHandler.Adapter {
    private static final Logger LOG = LoggerFactory.getLogger(IpmiServerAsfMessageHandlerImpl.class);
    
    private IpmiPayloadReceiveDispatcher dispatcher;
    private IpmiPacketSender sender;
    
    public IpmiServerAsfMessageHandlerImpl(@Nonnull IpmiPayloadReceiveDispatcher dispatcher, @Nonnull IpmiPacketSender sender) {
    	this.dispatcher = dispatcher;
    	this.sender = sender;
    }

	@Override
	public void handleAsfResetData(IpmiHandlerContext context, AsfResetData message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleAsfPowerUpData(IpmiHandlerContext context, AsfPowerUpData message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleAsfUnconditionalPowerDownData(IpmiHandlerContext context, AsfUnconditionalPowerDownData message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleAsfPowerCycleResetData(IpmiHandlerContext context, AsfPowerCycleResetData message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleAsfPresencePongData(IpmiHandlerContext context, AsfPresencePongData message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleAsfCapabilitiesResponseData(IpmiHandlerContext context, AsfCapabilitiesResponseData message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleAsfSystemStateResponseData(IpmiHandlerContext context, AsfSystemStateResponseData message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleAsfOpenSessionResponseData(IpmiHandlerContext context, AsfOpenSessionResponseData message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleAsfCloseSessionResponseData(IpmiHandlerContext context, AsfCloseSessionResponseData message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleAsfPresencePingData(IpmiHandlerContext context, AsfPresencePingData message) {
		RmcpPacket packet = new RmcpPacket();
		
		packet.withRemoteAddress(context.getSystemAddress());
		
		AsfPresencePongData data = new AsfPresencePongData();
		
		packet.withData(data);
		
		sender.send(packet);
	}

	@Override
	public void handleAsfCapabilitiesRequestData(IpmiHandlerContext context, AsfCapabilitiesRequestData message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleAsfSystemStateRequestData(IpmiHandlerContext context, AsfSystemStateRequestData message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleAsfOpenSessionRequestData(IpmiHandlerContext context, AsfOpenSessionRequestData message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleAsfCloseSessionRequestData(IpmiHandlerContext context, AsfCloseSessionRequestData message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleAsfRAKPMessage1Data(IpmiHandlerContext context, AsfRAKPMessage1Data message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleAsfRAKPMessage2Data(IpmiHandlerContext context, AsfRAKPMessage2Data message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleAsfRAKPMessage3Data(IpmiHandlerContext context, AsfRAKPMessage3Data message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

}
