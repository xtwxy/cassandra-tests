package ipmi.test;

import java.net.InetSocketAddress;

import org.anarres.ipmi.protocol.client.dispatch.IpmiPayloadTransmitQueue;
import org.anarres.ipmi.protocol.client.dispatch.IpmiReceiver;
import org.anarres.ipmi.protocol.client.session.IpmiSession;
import org.anarres.ipmi.protocol.client.session.IpmiSessionManager;
import org.anarres.ipmi.protocol.client.visitor.IpmiHandlerContext;
import org.anarres.ipmi.protocol.packet.ipmi.payload.IpmiPayload;
import org.anarres.ipmi.protocol.packet.rmcp.Packet;
import org.anarres.ipmi.protocol.server.IpmiServerAsfMessageHandlerImpl;
import org.anarres.ipmi.protocol.server.IpmiServerIpmiCommandHandlerImpl;
import org.anarres.ipmi.protocol.server.IpmiServerIpmiPayloadHandlerImpl;
import org.anarres.ipmi.protocol.server.dispatch.IpmiPayloadReceiveDispatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

@Sharable
public class ServerHandler 
	extends ChannelInboundHandlerAdapter
	implements IpmiHandlerContext.IpmiPacketQueue, IpmiPayloadTransmitQueue.IpmiPacketSender {

	private static final Logger LOG = LoggerFactory.getLogger(ServerHandler.class);

	private Channel channel;
	private final IpmiSessionManager sessionManager = new IpmiSessionManager();
	private IpmiPayloadReceiveDispatcher dispatcher = new IpmiPayloadReceiveDispatcher(sessionManager);
    private final IpmiPayloadTransmitQueue queue = new IpmiPayloadTransmitQueue(dispatcher, this);
	private IpmiServerIpmiPayloadHandlerImpl ipmiPayloadHandler = new IpmiServerIpmiPayloadHandlerImpl(dispatcher, this);
	private IpmiServerAsfMessageHandlerImpl asfMessageHandler = new IpmiServerAsfMessageHandlerImpl(dispatcher, this);
	private IpmiServerIpmiCommandHandlerImpl ipmiCommandHandler = new IpmiServerIpmiCommandHandlerImpl(dispatcher, this);
	
	ServerHandler() {
		dispatcher.setIpmiPayloadHandler(ipmiPayloadHandler, asfMessageHandler, ipmiCommandHandler);
	}
	
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
    	this.channel = ctx.channel();
        ctx.fireChannelActive();
    }
	
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        try {
            final Packet packet = (Packet) msg;
            IpmiHandlerContext context = new IpmiHandlerContext(this, (InetSocketAddress) packet.getRemoteAddress());
            dispatcher.dispatch(context, packet);
            LOG.error(msg.toString());
            System.out.println(msg.toString());
        } catch (Exception e) {
            ctx.fireExceptionCaught(e);
            throw e;
        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        LOG.error("Error on channel: " + cause, cause);
    }

	@Override
	public void queue(IpmiHandlerContext context, IpmiSession session, IpmiPayload message,
			Class<? extends IpmiPayload> responseType, IpmiReceiver receiver) {
		queue.queue(context, session, message, responseType, receiver);	
	}

	@Override
	public void send(Packet packet) {
		channel.writeAndFlush(packet, channel.voidPromise());	
	}
}
