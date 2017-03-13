package ipmi.test;

import java.util.concurrent.ThreadFactory;

import org.anarres.ipmi.client.netty.IpmiPipelineInitializer;
import org.anarres.ipmi.protocol.client.session.IpmiSessionManager;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.udt.nio.NioUdtProvider;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.util.concurrent.DefaultThreadFactory;

public class Server {
	private Integer port;
	private final IpmiPipelineInitializer.SharedHandlers sharedHandlers;

	public Server(Integer port) {
		this.port = port;
		this.sharedHandlers = new IpmiPipelineInitializer.SharedHandlers(new IpmiSessionManager());
	}

	public void start() {
		ThreadFactory factory = new DefaultThreadFactory("ipmi-client");
		NioEventLoopGroup group = new NioEventLoopGroup(0, factory, NioUdtProvider.MESSAGE_PROVIDER);

		try {
			ServerBootstrap b = new ServerBootstrap();
			b.group(group, group)
				.channelFactory(NioUdtProvider.MESSAGE_ACCEPTOR)
				.option(ChannelOption.SO_BACKLOG, 10)
				.handler(new LoggingHandler(LogLevel.INFO))
				.childHandler(new IpmiPipelineInitializer(sharedHandlers, new ChannelHandler() {

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

				}));
			Channel	channel = b.bind("0.0.0.0", 9000).sync().channel();
			channel.closeFuture().sync();
			System.out.println("server started with port = " + port + ".");
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			group.shutdownGracefully();
		}
	}
}
