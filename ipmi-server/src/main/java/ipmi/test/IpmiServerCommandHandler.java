package ipmi.test;

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
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.ActivateSessionRequest;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.ActivateSessionResponse;
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

public class IpmiServerCommandHandler implements IpmiClientIpmiCommandHandler {

	@Override
	public void handleGetDeviceIdRequest(IpmiHandlerContext context, GetDeviceIdRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetDeviceIdResponse(IpmiHandlerContext context, GetDeviceIdResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetChannelAuthenticationCapabilitiesRequest(IpmiHandlerContext context,
			GetChannelAuthenticationCapabilitiesRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetChannelAuthenticationCapabilitiesResponse(IpmiHandlerContext context,
			GetChannelAuthenticationCapabilitiesResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleSetSessionPrivilegeLevelRequest(IpmiHandlerContext context,
			SetSessionPrivilegeLevelRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleSetSessionPrivilegeLevelResponse(IpmiHandlerContext context,
			SetSessionPrivilegeLevelResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleCloseSessionRequest(IpmiHandlerContext context, CloseSessionRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleCloseSessionResponse(IpmiHandlerContext context, CloseSessionResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetChannelAccessRequest(IpmiHandlerContext context, GetChannelAccessRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetChannelAccessResponse(IpmiHandlerContext context, GetChannelAccessResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetChannelInfoRequest(IpmiHandlerContext context, GetChannelInfoRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetChannelInfoResponse(IpmiHandlerContext context, GetChannelInfoResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetChannelCipherSuitesRequest(IpmiHandlerContext context, GetChannelCipherSuitesRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetChannelCipherSuitesResponse(IpmiHandlerContext context,
			GetChannelCipherSuitesResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetChassisCapabilitiesRequest(IpmiHandlerContext context, GetChassisCapabilitiesRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetChassisCapabilitiesResponse(IpmiHandlerContext context,
			GetChassisCapabilitiesResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetChassisStatusRequest(IpmiHandlerContext context, GetChassisStatusRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetChassisStatusResponse(IpmiHandlerContext context, GetChassisStatusResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleChassisControlRequest(IpmiHandlerContext context, ChassisControlRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleChassisControlResponse(IpmiHandlerContext context, ChassisControlResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSystemRestartCauseRequest(IpmiHandlerContext context, GetSystemRestartCauseRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSystemRestartCauseResponse(IpmiHandlerContext context,
			GetSystemRestartCauseResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSensorThresholdRequest(IpmiHandlerContext context, GetSensorThresholdRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSensorThresholdResponse(IpmiHandlerContext context, GetSensorThresholdResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSensorReadingRequest(IpmiHandlerContext context, GetSensorReadingRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSensorReadingResponse(IpmiHandlerContext context, GetSensorReadingResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetFRUInventoryAreaInfoRequest(IpmiHandlerContext context,
			GetFRUInventoryAreaInfoRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetFRUInventoryAreaInfoResponse(IpmiHandlerContext context,
			GetFRUInventoryAreaInfoResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleReadFRUDataRequest(IpmiHandlerContext context, ReadFRUDataRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleReadFRUDataResponse(IpmiHandlerContext context, ReadFRUDataResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSDRRepositoryInfoRequest(IpmiHandlerContext context, GetSDRRepositoryInfoRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSDRRepositoryInfoResponse(IpmiHandlerContext context, GetSDRRepositoryInfoResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleReserveSDRRepositoryRequest(IpmiHandlerContext context, ReserveSDRRepositoryRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleReserveSDRRepositoryResponse(IpmiHandlerContext context, ReserveSDRRepositoryResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSDRRequest(IpmiHandlerContext context, GetSDRRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSDRResponse(IpmiHandlerContext context, GetSDRResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSELInfoRequest(IpmiHandlerContext context, GetSELInfoRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSELInfoResponse(IpmiHandlerContext context, GetSELInfoResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSELAllocationInfoRequest(IpmiHandlerContext context, GetSELAllocationInfoRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSELAllocationInfoResponse(IpmiHandlerContext context, GetSELAllocationInfoResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetLANConfigurationParametersRequest(IpmiHandlerContext context,
			GetLANConfigurationParametersRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetLANConfigurationParametersResponse(IpmiHandlerContext context,
			GetLANConfigurationParametersResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSOLConfigurationParametersRequest(IpmiHandlerContext context,
			GetSOLConfigurationParametersRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSOLConfigurationParametersResponse(IpmiHandlerContext context,
			GetSOLConfigurationParametersResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleGetSessionChallengeRequest(IpmiHandlerContext context, GetSessionChallengeRequest request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleGetSessionChallengeResponse(IpmiHandlerContext context, GetSessionChallengeResponse response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleActivateSessionRequest(IpmiHandlerContext context,
			ActivateSessionRequest activateSessionRequest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleActivateSessionResponse(IpmiHandlerContext context,
			ActivateSessionResponse activateSessionResponse) {
		// TODO Auto-generated method stub
		
	}

}
