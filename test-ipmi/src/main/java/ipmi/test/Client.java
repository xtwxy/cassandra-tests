package ipmi.test;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import org.anarres.ipmi.client.netty.IpmiCodec;
import org.anarres.ipmi.client.netty.IpmiPipelineInitializer;
import org.anarres.ipmi.protocol.client.session.IpmiSessionManager;
import org.anarres.ipmi.protocol.packet.asf.AsfCapabilitiesRequestData;
import org.anarres.ipmi.protocol.packet.rmcp.RmcpPacket;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.udt.UdtChannel;
import io.netty.channel.udt.nio.NioUdtProvider;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.util.concurrent.DefaultExecutorServiceFactory;
import io.netty.util.concurrent.ExecutorServiceFactory;

public class Client {
	private String address = "localhost";
	private Integer port = 0x0298;
	private final IpmiPipelineInitializer.SharedHandlers sharedHandlers;

	public Client() {
		this.sharedHandlers = new IpmiPipelineInitializer.SharedHandlers(new IpmiSessionManager());
	}

	public Client(String address) {
		this();
		this.address = address;
	}
	
	public Client(String address, Integer port) {
		this();
		this.address = address;
		this.port = port;
	}

	public void start() {
		ExecutorServiceFactory factory = new DefaultExecutorServiceFactory("ipmi-client");
		NioEventLoopGroup group = new NioEventLoopGroup(1, factory, NioUdtProvider.MESSAGE_PROVIDER);
		
		try {
			Bootstrap boot = new Bootstrap();
//			boot.group(group)
//				.channelFactory(NioUdtProvider.MESSAGE_CONNECTOR)
//				.handler(new IpmiPipelineInitializer(sharedHandlers, new ClientHandler()));
			
            boot.group(group)
                    .channelFactory(NioUdtProvider.MESSAGE_CONNECTOR)
                    .handler(new ChannelInitializer<UdtChannel>() {
                        @Override
                        public void initChannel(final UdtChannel ch)
                                throws Exception {
                            ch.pipeline().addLast(
                            		new IpmiCodec(new IpmiSessionManager()),
                                    new LoggingHandler(LogLevel.INFO),
                                    new ClientHandler());
                        }
                    });
			
			Channel	channel = boot.connect(address, port).sync().channel();

			channel.closeFuture().sync();
			System.out.println("client started.");
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			group.shutdownGracefully();
		}
	}
}
