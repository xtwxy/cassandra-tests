package ipmi.test;

import java.util.concurrent.ThreadFactory;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.DatagramChannel;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.util.concurrent.DefaultThreadFactory;

public class IpmiServerImpl {

	private Integer port = 8007;
	private Channel channel;

	public IpmiServerImpl(Integer port) {
		this.port = port;
	}

	public void start() throws Exception {

		ThreadFactory factory = new DefaultThreadFactory("ipmi-client");
		EventLoopGroup group = new NioEventLoopGroup(1, factory);

		Bootstrap b = new Bootstrap();
		b.group(group)
		.channel(NioDatagramChannel.class)
        .handler(new ChannelInitializer<DatagramChannel>() {

			@Override
			protected void initChannel(DatagramChannel ch) throws Exception {
				ch.pipeline().addLast(
                       new LoggingHandler(LogLevel.INFO),
                       new ServerHandler());
			}
       	 
        });
		channel = b.bind(port).sync().channel();
		channel.closeFuture().await();
		System.out.println("server started with port = " + port + ".");
	}

}
