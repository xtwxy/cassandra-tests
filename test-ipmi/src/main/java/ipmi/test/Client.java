package ipmi.test;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import org.anarres.ipmi.client.netty.IpmiPipelineInitializer;
import org.anarres.ipmi.protocol.client.session.IpmiSessionManager;
import org.anarres.ipmi.protocol.packet.asf.AsfCapabilitiesRequestData;
import org.anarres.ipmi.protocol.packet.rmcp.RmcpPacket;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPromise;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.udt.nio.NioUdtProvider;
import io.netty.util.concurrent.DefaultExecutorServiceFactory;
import io.netty.util.concurrent.ExecutorServiceFactory;

public class Client {
	private final IpmiPipelineInitializer.SharedHandlers sharedHandlers;

	public Client() {
		this.sharedHandlers = new IpmiPipelineInitializer.SharedHandlers(new IpmiSessionManager());
	}

	public void start() {
		ExecutorServiceFactory factory = new DefaultExecutorServiceFactory("ipmi-client");
		NioEventLoopGroup group = new NioEventLoopGroup(1, factory, NioUdtProvider.MESSAGE_PROVIDER);

		try {
			Bootstrap b = new Bootstrap();
			b.group(group)
				.channelFactory(NioUdtProvider.MESSAGE_ACCEPTOR)
				.option(ChannelOption.SO_BACKLOG, 10)
				.handler(new IpmiPipelineInitializer(sharedHandlers, new ChannelHandler() {

					@Override
					public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
						System.out.println("handlerAdded.");
					}

					@Override
					public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
						System.out.println("handlerRemoved.");
					}

					@Override
					public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
						System.out.println("exceptionCaught.");
					}

					@Override
					public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
						System.out.println("channelRegistered.");
					}

					@Override
					public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
						System.out.println("channelUnregistered.");
						
					}

					@Override
					public void channelActive(ChannelHandlerContext ctx) throws Exception {
						System.out.println("channelActive.");
					}

					@Override
					public void channelInactive(ChannelHandlerContext ctx) throws Exception {
						System.out.println("channelInactive.");
					}

					@Override
					public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
						System.out.println("channelRead.");
					}

					@Override
					public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
						System.out.println("channelReadComplete.");
					}

					@Override
					public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
						System.out.println("userEventTriggered.");
						
					}

					@Override
					public void channelWritabilityChanged(ChannelHandlerContext ctx) throws Exception {
						System.out.println("channelWritabilityChanged.");
					}

					@Override
					public void bind(ChannelHandlerContext ctx, SocketAddress localAddress, ChannelPromise promise)
							throws Exception {
						System.out.println("bind.");
					}

					@Override
					public void connect(ChannelHandlerContext ctx, SocketAddress remoteAddress,
							SocketAddress localAddress, ChannelPromise promise) throws Exception {
						System.out.println("connect.");
					}

					@Override
					public void disconnect(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
						System.out.println("disconnect.");
					}

					@Override
					public void close(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
						System.out.println("close.");
					}

					@Override
					public void deregister(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
						System.out.println("deregister.");
					}

					@Override
					public void read(ChannelHandlerContext ctx) throws Exception {
						System.out.println("read.");
					}

					@Override
					public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
						System.out.println("write.");
					}

					@Override
					public void flush(ChannelHandlerContext ctx) throws Exception {
						System.out.println("flush.");
						
					}

				}));
			Channel	channel = b.connect("192.168.0.69", 9000).sync().channel();
			
	    	RmcpPacket packet = new RmcpPacket();
	    	AsfCapabilitiesRequestData data = new AsfCapabilitiesRequestData();
	    
			packet.withData(data);
			SocketAddress remoteAddress = new InetSocketAddress("192.168.0.69", 9000);
			packet.withRemoteAddress(remoteAddress);
			
			channel.writeAndFlush("String", channel.voidPromise()).sync();
			channel.closeFuture().sync();
			System.out.println("client started.");
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			group.shutdownGracefully();
		}
	}
}
