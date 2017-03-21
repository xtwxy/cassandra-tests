package ipmi.test;

import org.anarres.ipmi.client.netty.IpmiPipelineInitializer;
import org.anarres.ipmi.protocol.client.session.IpmiSessionManager;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.DatagramChannel;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

public class Client {
	private String address = "localhost";
	private Integer port = 0x0298;
	private final IpmiPipelineInitializer.SharedHandlers sharedHandlers;

	public Client() {
		this.sharedHandlers = new IpmiPipelineInitializer.SharedHandlers(new IpmiSessionManager());
		this.sharedHandlers.setDebug(true);
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

	public void start() throws Exception {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group)
             .channel(NioDatagramChannel.class)
             .handler(new ChannelInitializer<DatagramChannel>() {

				@Override
				protected void initChannel(DatagramChannel ch) throws Exception {
					ch.pipeline().addLast(
                            new LoggingHandler(LogLevel.INFO),
                            //new IpmiCodec(new IpmiSessionManager()),
                            new ClientHandler(address, port));
				}
            	 
             });

            Channel ch = b.bind(0).sync().channel();

            ch.closeFuture().await();
        } finally {
            group.shutdownGracefully();
        }
	}
}
