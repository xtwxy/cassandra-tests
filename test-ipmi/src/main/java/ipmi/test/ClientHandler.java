package ipmi.test;

import java.net.InetSocketAddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.CharsetUtil;

@Sharable
public class ClientHandler 
	//extends SimpleChannelInboundHandler<DatagramPacket> {
	extends ChannelInboundHandlerAdapter {

	private static final Logger LOG = LoggerFactory.getLogger(ClientHandler.class);
	private String host;
	private Integer port;

	public ClientHandler(String host, Integer port) {
		// super(false);
		this.host = host;
		this.port = port;
	}

	@Override
	public void channelActive(final ChannelHandlerContext ctx) {
		System.err.println("channelActive");

//		ChassisControlRequest r = new ChassisControlRequest();
//		r.chassisCommand = ChassisControlRequest.ChassisCommand.PowerUp;
		
		DatagramPacket msg = new DatagramPacket(
				Unpooled.copiedBuffer("0xcafe!", CharsetUtil.UTF_8),
				new InetSocketAddress(host, port));
		ctx.writeAndFlush(msg);
	}

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		LOG.info("channelRead: " + msg.toString());
		if(msg instanceof DatagramPacket) {
			DatagramPacket dg = (DatagramPacket) msg;
			ctx.writeAndFlush(new DatagramPacket(dg.content(), dg.sender()));
		} else {
			LOG.info("channelRead: not a datagram packet.");
		}
    }

//	@Override
//	protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception {
//		LOG.info("channelRead0: " + msg.toString());
//		DatagramPacket dg = (DatagramPacket) msg;
//		ctx.writeAndFlush(new DatagramPacket(dg.content(), dg.sender()));
//	}
}
