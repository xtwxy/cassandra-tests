package ipmi.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;

@Sharable
public class ServerHandler extends SimpleChannelInboundHandler<DatagramPacket> {

	private static final Logger LOG = LoggerFactory.getLogger(ServerHandler.class);
	ServerHandler() {
		super(false);
	}
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception {
		System.err.println(msg);
		LOG.info(msg.toString());
		ctx.writeAndFlush(new DatagramPacket(msg.content(), msg.sender()));
	}
}
