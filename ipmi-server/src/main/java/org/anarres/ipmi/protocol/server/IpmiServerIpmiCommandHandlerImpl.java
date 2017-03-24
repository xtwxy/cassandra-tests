package org.anarres.ipmi.protocol.server;

import javax.annotation.Nonnull;

import org.anarres.ipmi.protocol.client.dispatch.IpmiPayloadTransmitQueue.IpmiPacketSender;
import org.anarres.ipmi.protocol.client.visitor.IpmiClientIpmiCommandHandler;
import org.anarres.ipmi.protocol.client.visitor.IpmiHandlerContext;
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
import org.anarres.ipmi.protocol.packet.ipmi.command.lan.GetLANConfigurationParametersRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.lan.GetLANConfigurationParametersResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.CloseSessionRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.CloseSessionResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelAccessRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelAccessResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelAuthenticationCapabilitiesRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelAuthenticationCapabilitiesResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelCipherSuitesRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelCipherSuitesResponse;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelInfoRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelInfoResponse;
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
import org.anarres.ipmi.protocol.server.dispatch.IpmiPayloadReceiveDispatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IpmiServerIpmiCommandHandlerImpl implements IpmiClientIpmiCommandHandler {
    private static final Logger LOG = LoggerFactory.getLogger(IpmiServerAsfMessageHandlerImpl.class);
    
    private IpmiPayloadReceiveDispatcher dispatcher;
    private IpmiPacketSender sender;
    
    public IpmiServerIpmiCommandHandlerImpl(@Nonnull IpmiPayloadReceiveDispatcher dispatcher, @Nonnull IpmiPacketSender sender) {
    	this.dispatcher = dispatcher;
    	this.sender = sender;
    }

	@Override
	public void handleGetDeviceIdRequest(IpmiHandlerContext context, GetDeviceIdRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetDeviceIdResponse(IpmiHandlerContext context, GetDeviceIdResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetChannelAuthenticationCapabilitiesRequest(IpmiHandlerContext context,
			GetChannelAuthenticationCapabilitiesRequest request) {
		GetChannelAuthenticationCapabilitiesResponse response = new GetChannelAuthenticationCapabilitiesResponse();
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleGetChannelAuthenticationCapabilitiesResponse(IpmiHandlerContext context,
			GetChannelAuthenticationCapabilitiesResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleSetSessionPrivilegeLevelRequest(IpmiHandlerContext context,
			SetSessionPrivilegeLevelRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleSetSessionPrivilegeLevelResponse(IpmiHandlerContext context,
			SetSessionPrivilegeLevelResponse response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleCloseSessionRequest(IpmiHandlerContext context, CloseSessionRequest request) {
		throw new UnsupportedOperationException("Not implemented.");
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

}
