package ipmi.test;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import org.anarres.ipmi.protocol.packet.asf.AsfCapabilitiesRequestData;
import org.anarres.ipmi.protocol.packet.rmcp.RmcpPacket;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.udt.UdtMessage;

public class ClientHandler extends SimpleChannelInboundHandler<UdtMessage> {

    private final UdtMessage message;

    public ClientHandler() {
        super(false);
        final ByteBuf byteBuf = Unpooled.buffer(32);
        for (int i = 0; i < byteBuf.capacity(); i++) {
            byteBuf.writeByte((byte) i);
        }
        message = new UdtMessage(byteBuf);
    }

    @Override
    public void channelActive(final ChannelHandlerContext ctx) {
//        System.err.println("ECHO active " + NioUdtProvider.socketUDT(ctx.channel()).toStringOptions());
//        ctx.writeAndFlush(message);
    	
		RmcpPacket packet = new RmcpPacket();
    	AsfCapabilitiesRequestData data = new AsfCapabilitiesRequestData();
    
		packet.withData(data);
		SocketAddress remoteAddress = new InetSocketAddress("192.168.0.69", 9000);
		packet.withRemoteAddress(remoteAddress);
		
		ctx.channel().writeAndFlush(packet);//, channel.voidPromise()).sync();
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(final ChannelHandlerContext ctx, final Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

	@Override
	protected void messageReceived(ChannelHandlerContext ctx, UdtMessage msg) throws Exception {
		System.err.println("message received.");
        ctx.write(msg);
		//msg.release();
	}
}
