package org.anarres.ipmi.protocol.server;

import org.anarres.ipmi.protocol.client.dispatch.AbstractIpmiReceiver;
import org.anarres.ipmi.protocol.client.dispatch.IpmiReceiverKey;
import org.anarres.ipmi.protocol.client.session.IpmiSession;
import org.anarres.ipmi.protocol.client.visitor.IpmiHandlerContext;
import org.anarres.ipmi.protocol.packet.ipmi.command.messaging.GetChannelAuthenticationCapabilitiesRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetChannelAuthenticationCapabilitiesRequestReceiver extends AbstractIpmiReceiver<GetChannelAuthenticationCapabilitiesRequest> {
    private static final Logger LOG = LoggerFactory.getLogger(IpmiServerAsfMessageHandlerImpl.class);

	public GetChannelAuthenticationCapabilitiesRequestReceiver() {
		super(GetChannelAuthenticationCapabilitiesRequest.class);
	}

	@Override
	public void timeout(IpmiReceiverKey key) {
		LOG.info(key.toString());
	}

	@Override
	protected void doReceive(IpmiHandlerContext context, IpmiSession session,
			GetChannelAuthenticationCapabilitiesRequest response) {
		throw new UnsupportedOperationException("Not implemented.");
	}

}
