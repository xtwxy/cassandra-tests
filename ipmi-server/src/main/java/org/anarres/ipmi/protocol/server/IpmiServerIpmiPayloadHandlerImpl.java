package org.anarres.ipmi.protocol.server;

import javax.annotation.Nonnull;

import org.anarres.ipmi.protocol.client.dispatch.IpmiPayloadTransmitQueue.IpmiPacketSender;
import org.anarres.ipmi.protocol.client.dispatch.IpmiReceiver;
import org.anarres.ipmi.protocol.client.session.IpmiSession;
import org.anarres.ipmi.protocol.client.visitor.IpmiClientIpmiPayloadHandler;
import org.anarres.ipmi.protocol.client.visitor.IpmiHandlerContext;
import org.anarres.ipmi.protocol.packet.ipmi.command.IpmiCommand;
import org.anarres.ipmi.protocol.packet.ipmi.command.IpmiRequest;
import org.anarres.ipmi.protocol.packet.ipmi.payload.AbstractTaggedIpmiPayload;
import org.anarres.ipmi.protocol.packet.ipmi.payload.IpmiOpenSessionRequest;
import org.anarres.ipmi.protocol.packet.ipmi.payload.IpmiOpenSessionResponse;
import org.anarres.ipmi.protocol.packet.ipmi.payload.IpmiPayload;
import org.anarres.ipmi.protocol.packet.ipmi.payload.IpmiRAKPMessage1;
import org.anarres.ipmi.protocol.packet.ipmi.payload.IpmiRAKPMessage2;
import org.anarres.ipmi.protocol.packet.ipmi.payload.IpmiRAKPMessage3;
import org.anarres.ipmi.protocol.packet.ipmi.payload.IpmiRAKPMessage4;
import org.anarres.ipmi.protocol.packet.ipmi.payload.OemExplicit;
import org.anarres.ipmi.protocol.packet.ipmi.payload.SOLMessage;
import org.anarres.ipmi.protocol.server.dispatch.IpmiPayloadReceiveDispatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Preconditions;

public class IpmiServerIpmiPayloadHandlerImpl extends IpmiClientIpmiPayloadHandler.TaggedAdapter {
    private static final Logger LOG = LoggerFactory.getLogger(IpmiPayloadReceiveDispatcher.class);
    
    private final IpmiPayloadReceiveDispatcher dispatcher;
    private IpmiPacketSender sender;
    
    public IpmiServerIpmiPayloadHandlerImpl(IpmiPayloadReceiveDispatcher dispatcher, @Nonnull IpmiPacketSender sender) {
    	this.dispatcher = dispatcher;
    	this.sender = sender;
    }
    
	@Override
	public void handleOpenSessionRequest(IpmiHandlerContext context, IpmiSession session,
			IpmiOpenSessionRequest message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleOpenSessionResponse(IpmiHandlerContext context, IpmiSession session,
			IpmiOpenSessionResponse message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleRAKPMessage1(IpmiHandlerContext context, IpmiSession session, IpmiRAKPMessage1 message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleRAKPMessage2(IpmiHandlerContext context, IpmiSession session, IpmiRAKPMessage2 message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleRAKPMessage3(IpmiHandlerContext context, IpmiSession session, IpmiRAKPMessage3 message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleRAKPMessage4(IpmiHandlerContext context, IpmiSession session, IpmiRAKPMessage4 message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleSOL(IpmiHandlerContext context, IpmiSession session, SOLMessage message) {
		throw new UnsupportedOperationException("Not implemented.");
	}

	@Override
	public void handleOemExplicit(IpmiHandlerContext context, IpmiSession session, OemExplicit message) {
		throw new UnsupportedOperationException("Not implemented.");
	}
    @Override
    protected void handleDefault(IpmiHandlerContext context, IpmiSession session, IpmiPayload payload) {
    	Preconditions.checkNotNull(payload, "Message was null.");
        LOG.warn("Discarded:\n" + payload); 
    }

    @Override
    protected void handleTagged(@Nonnull IpmiHandlerContext context, @Nonnull IpmiSession session, @Nonnull AbstractTaggedIpmiPayload payload) {
        IpmiReceiver receiver = (IpmiReceiver) dispatcher.getReceiver(context, payload.getClass(), payload.getMessageTag());
        if (receiver != null) {
            receiver.receive(context, session, payload);
            return;
        }
        handleDefault(context, session, payload);
    }

    /** Section 6.12.8, page 58: Requests and responses are matched on the IPMI Seq field. */
    @Override
    public void handleCommand(IpmiHandlerContext context, IpmiSession session, IpmiCommand message) {
        if (message instanceof IpmiRequest) {
            IpmiRequest response = (IpmiRequest) message;
            IpmiReceiver receiver = dispatcher.getReceiver(context, response.getClass(), message.getSequenceNumber());
            if (receiver != null) {
                receiver.receive(context, session, response);
                return;
            }
        }
        handleDefault(context, session, message);
    }
}
