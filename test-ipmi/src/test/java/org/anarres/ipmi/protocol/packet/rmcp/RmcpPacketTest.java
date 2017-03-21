package org.anarres.ipmi.protocol.packet.rmcp;

import static org.junit.Assert.assertEquals;

import org.anarres.ipmi.client.netty.IpmiCodec;
import org.anarres.ipmi.protocol.client.session.IpmiPacketContext;
import org.anarres.ipmi.protocol.client.session.IpmiSessionManager;
import org.anarres.ipmi.protocol.packet.asf.AsfCapabilitiesRequestData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.util.internal.SocketUtils;

public class RmcpPacketTest {

	private static final String host = "192.168.0.69";
	private static final int port = 8007;
	private IpmiPacketContext context;
	private IpmiCodec codec;
	private EmbeddedChannel channel;
	
	private static final byte[] byteSequence = {};

	@Before
	public void setUp() throws Exception {
		context = new IpmiSessionManager();
		codec = new IpmiCodec(context);
		channel = new EmbeddedChannel(codec);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMarshal() throws Exception {
		RmcpPacket rp = new RmcpPacket();
		
		rp.withSequenceNumber((byte)0);
		rp.withRemoteAddress(SocketUtils.socketAddress(host, port));
		
		RmcpData data = new AsfCapabilitiesRequestData();
		
		rp.withData(data);
		
		channel.writeAndFlush(rp).sync();
		Object o = channel.readOutbound();
		System.out.println(o.getClass().getName());
		assertEquals(rp, channel.readOutbound());
	}

	@Test
	public void testUnmarshal() {
	}
}
