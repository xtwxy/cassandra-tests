package org.anarres.ipmi.protocol.server;

import java.util.HashSet;

import javax.annotation.Nonnull;

import org.anarres.ipmi.protocol.IanaEnterpriseNumber;
import org.anarres.ipmi.protocol.client.dispatch.IpmiPayloadTransmitQueue.IpmiPacketSender;
import org.anarres.ipmi.protocol.client.session.IpmiSession;
import org.anarres.ipmi.protocol.client.visitor.IpmiClientIpmiCommandHandler;
import org.anarres.ipmi.protocol.client.visitor.IpmiHandlerContext;
import org.anarres.ipmi.protocol.packet.ipmi.Ipmi15SessionWrapper;
import org.anarres.ipmi.protocol.packet.ipmi.IpmiChannelNumber;
import org.anarres.ipmi.protocol.packet.ipmi.IpmiSessionAuthenticationType;
import org.anarres.ipmi.protocol.packet.ipmi.command.chassis.ChassisControlRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.chassis.ChassisControlResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.chassis.GetChassisCapabilitiesRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.chassis.GetChassisCapabilitiesResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.chassis.GetChassisStatusRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.chassis.GetChassisStatusResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.chassis.GetSystemRestartCauseRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.chassis.GetSystemRestartCauseResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.fru.GetFRUInventoryAreaInfoRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.fru.GetFRUInventoryAreaInfoResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.fru.ReadFRUDataRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.fru.ReadFRUDataResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.global.GetDeviceIdRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.global.GetDeviceIdResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.global.GetDeviceIdResponse.DeviceSupport;
import org.anarres.ipmi.protocol.packet.ipmi.command.lan.GetLANConfigurationParametersRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.lan.GetLANConfigurationParametersResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.ActivateSessionRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.ActivateSessionResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.CloseSessionRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.CloseSessionResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelAccessRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelAccessResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelAuthenticationCapabilitiesRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelAuthenticationCapabilitiesResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelAuthenticationCapabilitiesResponse.ExtendedCapabilities;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelAuthenticationCapabilitiesResponse.LoginStatus;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelCipherSuitesRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelCipherSuitesResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelInfoRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelInfoResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetSessionChallengeRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetSessionChallengeResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.SetSessionPrivilegeLevelRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.SetSessionPrivilegeLevelResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.sdr.GetSDRRepositoryInfoRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.sdr.GetSDRRepositoryInfoResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.sdr.GetSDRRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.sdr.GetSDRResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.sdr.ReserveSDRRepositoryRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.sdr.ReserveSDRRepositoryResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.sel.GetSELAllocationInfoRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.sel.GetSELAllocationInfoResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.sel.GetSELInfoRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.sel.GetSELInfoResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.sensor.GetSensorReadingRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.sensor.GetSensorReadingResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.sensor.GetSensorThresholdRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.sensor.GetSensorThresholdResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.sol.GetSOLConfigurationParametersRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.sol.GetSOLConfigurationParametersResponse;
import org.anarres.ipmi.protocol.packet.ipmi.payload.RequestedMaximumPrivilegeLevel;
import org.anarres.ipmi.protocol.packet.rmcp.RmcpMessageClass;
import org.anarres.ipmi.protocol.packet.rmcp.RmcpMessageRole;
import org.anarres.ipmi.protocol.packet.rmcp.RmcpPacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IpmiServerIpmiCommandHandlerImpl implements IpmiClientIpmiCommandHandler {
    private static final byte[] AUTH_CODE = new byte[]{
			(byte)0xcc, (byte)0x80, 0x48, 
			(byte)0x95, 0x00, 0x2a, (byte)0xd6, (byte)0xe6, (byte)0xb3, 0x7c, 0x2a, 
			0x6d, 0x17, 0x2a, 0x40, 0x4b
	};

	private static final Logger LOG = LoggerFactory.getLogger(IpmiServerAsfMessageHandlerImpl.class);
   
    private IpmiSession session;
    private IpmiPacketSender sender;
    
    public IpmiServerIpmiCommandHandlerImpl(IpmiSession session, @Nonnull IpmiPacketSender sender) {
    	this.session = session;
    	this.sender = sender;
    }

	@Override
	public void handleGetDeviceIdRequest(IpmiHandlerContext context, GetDeviceIdRequest request) {
		LOG.info(request.toString());
		
		RmcpPacket packet = new RmcpPacket();
		
		packet.withRemoteAddress(context.getSystemAddress());
		packet.withMessageRole(RmcpMessageRole.ACK);
		packet.withMessageClass(RmcpMessageClass.IPMI);
		
		Ipmi15SessionWrapper data = new Ipmi15SessionWrapper();
		
		GetDeviceIdResponse response = new GetDeviceIdResponse();
		response.setSequenceNumber(request.getSequenceNumber());
		response.setIpmiCompletionCode((byte) 0x0);
		response.deviceFirmwareRevisionMajor = 0xcafe;
		response.auxiliaryFirmwareRevisionInformation = 0x22;
		response.deviceAvailable = true;
		response.deviceFirmwareRevisionMinor = 0x21;
		response.deviceId = 0x01;
		response.deviceIpmiRevision = 0x2;
		response.deviceProvidesDeviceSDRs = false;
		response.deviceRevision = 0x03;
		response.deviceSupport.add(DeviceSupport.Chassis);
		response.deviceSupport.add(DeviceSupport.SensorDevice);
		response.oemEnterpriseNumber = IanaEnterpriseNumber.IBM_Corporation.getNumber();
		response.productId = 0x04;
		
		data.setIpmiPayload(response);
		data.setIpmiSessionId(0);
		data.setIpmiSessionSequenceNumber(0);
		
		packet.withData(data);
		
		sender.send(packet);
		
		LOG.info(packet.toString());
	}

	@Override
	public void handleGetDeviceIdResponse(IpmiHandlerContext context, GetDeviceIdResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetChannelAuthenticationCapabilitiesRequest(IpmiHandlerContext context,
			GetChannelAuthenticationCapabilitiesRequest request) {
		LOG.info(request.toString());
		
		RmcpPacket packet = new RmcpPacket();
		
		packet.withRemoteAddress(context.getSystemAddress());
		packet.withMessageRole(RmcpMessageRole.ACK);
		packet.withMessageClass(RmcpMessageClass.IPMI);
		
		Ipmi15SessionWrapper data = new Ipmi15SessionWrapper();
		
		GetChannelAuthenticationCapabilitiesResponse response = new GetChannelAuthenticationCapabilitiesResponse();
		response.setSequenceNumber(request.getSequenceNumber());
		response.channelNumber = IpmiChannelNumber.CURRENT;
		
		response.authenticationTypes = new HashSet<>();
		response.authenticationTypes.add(IpmiSessionAuthenticationType.NONE);
		response.authenticationTypes.add(IpmiSessionAuthenticationType.PASSWORD);
		response.authenticationTypes.add(IpmiSessionAuthenticationType.MD2);
		response.authenticationTypes.add(IpmiSessionAuthenticationType.MD5);
		response.authenticationTypes.add(IpmiSessionAuthenticationType.OEM_PROPRIETARY);
		response.authenticationTypes.add(IpmiSessionAuthenticationType.RMCPP);
		
		response.loginStatus = new HashSet<>();
		response.loginStatus.add(LoginStatus.USERLEVEL_AUTH_STATUS);
	
		response.extendedCapabilities = new HashSet<>();
		response.extendedCapabilities.add(ExtendedCapabilities.IPMI20_CONNECTIONS_SUPPORTED);
		response.extendedCapabilities.add(ExtendedCapabilities.IPMI15_CONNECTIONS_SUPPORTED);
		
		data.setIpmiPayload(response);
		data.setIpmiSessionId(0);
		data.setIpmiSessionSequenceNumber(0);
		
		packet.withData(data);
		
		sender.send(packet);
		
		LOG.info(packet.toString());
	}

	@Override
	public void handleGetChannelAuthenticationCapabilitiesResponse(IpmiHandlerContext context,
			GetChannelAuthenticationCapabilitiesResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleSetSessionPrivilegeLevelRequest(IpmiHandlerContext context,
			SetSessionPrivilegeLevelRequest request) {
		RmcpPacket packet = new RmcpPacket();
		packet.withSequenceNumber(request.getSequenceNumber());
		packet.withRemoteAddress(context.getSystemAddress());
		
		Ipmi15SessionWrapper sessionWrapper = new Ipmi15SessionWrapper();
		
		SetSessionPrivilegeLevelResponse response = new SetSessionPrivilegeLevelResponse();
		
		response.withSource(request.getSourceAddress(), request.getSourceLun());
		response.withTarget(request.getTargetAddress(), request.getTargetLun());
		response.setSequenceNumber(request.getSequenceNumber());
		response.privilegeLevel = RequestedMaximumPrivilegeLevel.ADMINISTRATOR;
		
		sessionWrapper.setIpmiPayload(response);
		sessionWrapper.setIpmiSessionId(0);
		sessionWrapper.setIpmiSessionSequenceNumber(request.getSequenceNumber());
		sessionWrapper.withAuthenticationType(IpmiSessionAuthenticationType.MD5);
		
		sessionWrapper.setIpmiPayload(response);
		sessionWrapper.withMessageAuthenticationCode(AUTH_CODE);
		
		packet.withData(sessionWrapper);
		
		sender.send(packet);
		
		LOG.info(packet.toString());
	}

	@Override
	public void handleSetSessionPrivilegeLevelResponse(IpmiHandlerContext context,
			SetSessionPrivilegeLevelResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleCloseSessionRequest(IpmiHandlerContext context, CloseSessionRequest request) {
		RmcpPacket packet = new RmcpPacket();
		packet.withSequenceNumber(request.getSequenceNumber());
		packet.withRemoteAddress(context.getSystemAddress());
		
		Ipmi15SessionWrapper sessionWrapper = new Ipmi15SessionWrapper();
		
		CloseSessionResponse response = new CloseSessionResponse();
		
		response.withSource(request.getSourceAddress(), request.getSourceLun());
		response.withTarget(request.getTargetAddress(), request.getTargetLun());
		response.setSequenceNumber(request.getSequenceNumber());
		
		sessionWrapper.setIpmiPayload(response);
		sessionWrapper.setIpmiSessionId(0);
		sessionWrapper.setIpmiSessionSequenceNumber(request.getSequenceNumber());
		sessionWrapper.withAuthenticationType(IpmiSessionAuthenticationType.MD5);
		
		sessionWrapper.setIpmiPayload(response);
		sessionWrapper.withMessageAuthenticationCode(AUTH_CODE);
		
		packet.withData(sessionWrapper);
		
		sender.send(packet);
		
		LOG.info(packet.toString());
	}

	@Override
	public void handleCloseSessionResponse(IpmiHandlerContext context, CloseSessionResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetChannelAccessRequest(IpmiHandlerContext context, GetChannelAccessRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetChannelAccessResponse(IpmiHandlerContext context, GetChannelAccessResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetChannelInfoRequest(IpmiHandlerContext context, GetChannelInfoRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetChannelInfoResponse(IpmiHandlerContext context, GetChannelInfoResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetChannelCipherSuitesRequest(IpmiHandlerContext context, GetChannelCipherSuitesRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetChannelCipherSuitesResponse(IpmiHandlerContext context,
			GetChannelCipherSuitesResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetChassisCapabilitiesRequest(IpmiHandlerContext context, GetChassisCapabilitiesRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetChassisCapabilitiesResponse(IpmiHandlerContext context,
			GetChassisCapabilitiesResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetChassisStatusRequest(IpmiHandlerContext context, GetChassisStatusRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetChassisStatusResponse(IpmiHandlerContext context, GetChassisStatusResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleChassisControlRequest(IpmiHandlerContext context, ChassisControlRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleChassisControlResponse(IpmiHandlerContext context, ChassisControlResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSystemRestartCauseRequest(IpmiHandlerContext context, GetSystemRestartCauseRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSystemRestartCauseResponse(IpmiHandlerContext context,
			GetSystemRestartCauseResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSensorThresholdRequest(IpmiHandlerContext context, GetSensorThresholdRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSensorThresholdResponse(IpmiHandlerContext context, GetSensorThresholdResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSensorReadingRequest(IpmiHandlerContext context, GetSensorReadingRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSensorReadingResponse(IpmiHandlerContext context, GetSensorReadingResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetFRUInventoryAreaInfoRequest(IpmiHandlerContext context,
			GetFRUInventoryAreaInfoRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetFRUInventoryAreaInfoResponse(IpmiHandlerContext context,
			GetFRUInventoryAreaInfoResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleReadFRUDataRequest(IpmiHandlerContext context, ReadFRUDataRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleReadFRUDataResponse(IpmiHandlerContext context, ReadFRUDataResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSDRRepositoryInfoRequest(IpmiHandlerContext context, GetSDRRepositoryInfoRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSDRRepositoryInfoResponse(IpmiHandlerContext context, GetSDRRepositoryInfoResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleReserveSDRRepositoryRequest(IpmiHandlerContext context, ReserveSDRRepositoryRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleReserveSDRRepositoryResponse(IpmiHandlerContext context, ReserveSDRRepositoryResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSDRRequest(IpmiHandlerContext context, GetSDRRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSDRResponse(IpmiHandlerContext context, GetSDRResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSELInfoRequest(IpmiHandlerContext context, GetSELInfoRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSELInfoResponse(IpmiHandlerContext context, GetSELInfoResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSELAllocationInfoRequest(IpmiHandlerContext context, GetSELAllocationInfoRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSELAllocationInfoResponse(IpmiHandlerContext context, GetSELAllocationInfoResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetLANConfigurationParametersRequest(IpmiHandlerContext context,
			GetLANConfigurationParametersRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetLANConfigurationParametersResponse(IpmiHandlerContext context,
			GetLANConfigurationParametersResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSOLConfigurationParametersRequest(IpmiHandlerContext context,
			GetSOLConfigurationParametersRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSOLConfigurationParametersResponse(IpmiHandlerContext context,
			GetSOLConfigurationParametersResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetSessionChallengeRequest(IpmiHandlerContext context, GetSessionChallengeRequest request) {
		RmcpPacket packet = new RmcpPacket();
		
		packet.withSequenceNumber(request.getSequenceNumber());
		packet.withRemoteAddress(context.getSystemAddress());
		
		Ipmi15SessionWrapper sessionWrapper = new Ipmi15SessionWrapper();
		
		GetSessionChallengeResponse response = new GetSessionChallengeResponse();
		
		response.withChallengeStringData(request.getUserName());
		response.setSequenceNumber(request.getSequenceNumber());
		
		sessionWrapper.setIpmiPayload(response);
		sessionWrapper.setIpmiSessionId(0);
		
		packet.withData(sessionWrapper);
		
		sender.send(packet);
	}

	@Override
	public void handleGetSessionChallengeResponse(IpmiHandlerContext context, GetSessionChallengeResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleActivateSessionRequest(IpmiHandlerContext context,
			ActivateSessionRequest request) {
		RmcpPacket packet = new RmcpPacket();
		
		packet.withSequenceNumber(request.getSequenceNumber());
		packet.withRemoteAddress(context.getSystemAddress());
		
		Ipmi15SessionWrapper sessionWrapper = new Ipmi15SessionWrapper();
		
		ActivateSessionResponse response = new ActivateSessionResponse();
		
		response.withSource(request.getSourceAddress(), request.getSourceLun());
		response.withTarget(request.getTargetAddress(), request.getTargetLun());
		response.withAuthenticationType(request.getAuthenticationType());
		response.setSequenceNumber(request.getSequenceNumber());
	
		response.withSessionId(0xcafe);
		response.withInitialInboundSequence(request.getInitialOutboundSequence());
		response.withMaximumPrivilegeLevelAllowed(RequestedMaximumPrivilegeLevel.ADMINISTRATOR);
	
		sessionWrapper.setIpmiPayload(response);
		sessionWrapper.setIpmiSessionId(0);
		sessionWrapper.setIpmiSessionSequenceNumber(request.getSequenceNumber());
		sessionWrapper.withAuthenticationType(IpmiSessionAuthenticationType.MD5);
		sessionWrapper.withMessageAuthenticationCode(AUTH_CODE);
		
		packet.withData(sessionWrapper);

		sender.send(packet);
	}

	@Override
	public void handleActivateSessionResponse(IpmiHandlerContext context,
			ActivateSessionResponse activateSessionResponse) {
		throw new UnsupportedOperationException("Not implemented.");
	}

}
