package ipmi.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.CharsetUtil;
import io.netty.util.internal.SocketUtils;

@Sharable
public class ClientHandler extends SimpleChannelInboundHandler<DatagramPacket> {

	private static final Logger LOG = LoggerFactory.getLogger(ClientHandler.class);
	private String host;
	private Integer port;

	public ClientHandler(String host, Integer port) {
		super(false);
		this.host = host;
		this.port = port;
	}

	@Override
	public void channelActive(final ChannelHandlerContext ctx) {
		System.err.println("channelActive");

//		ctx.writeAndFlush(new DatagramPacket(Unpooled.copiedBuffer("QOTM?", CharsetUtil.UTF_8),
//				SocketUtils.socketAddress(host, port)));

		DatagramPacket msg = new DatagramPacket(Unpooled.copiedBuffer("Hello, World!", CharsetUtil.UTF_8),
				SocketUtils.socketAddress(host, port));
		ctx.writeAndFlush(msg);
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception {
		System.err.println(msg);
		LOG.info(msg.toString());
		ctx.writeAndFlush(new DatagramPacket(msg.content(), msg.sender()));
	}
}
