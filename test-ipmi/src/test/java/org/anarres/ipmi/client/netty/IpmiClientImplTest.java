/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.client.netty;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

import org.anarres.ipmi.protocol.packet.asf.AsfCapabilitiesRequestData;
import org.anarres.ipmi.protocol.packet.rmcp.RmcpPacket;
import org.junit.Test;
// import static org.junit.Assert.*;

/**
 *
 * @author shevek
 */
public class IpmiClientImplTest {

    @Test
    public void testClient() throws IOException, InterruptedException {
    	IpmiClientImpl client = new IpmiClientImpl();
    	client.start();
    	
    	RmcpPacket packet = new RmcpPacket();
    	AsfCapabilitiesRequestData data = new AsfCapabilitiesRequestData();
    
		packet.withData(data);
		SocketAddress remoteAddress = new InetSocketAddress("192.168.0.69", 9000);
		packet.withRemoteAddress(remoteAddress);
		client.send(packet);
    }
}
