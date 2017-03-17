package org.anarres.ipmi.protocol.packet.ipmi.command.chassis;

import java.nio.ByteBuffer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChassisControlRequestTest {
	private static final byte[] byteSequence = {
			0x01
	};
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMarshal() {
		ChassisControlRequest r = new ChassisControlRequest();
		r.chassisCommand = ChassisControlRequest.ChassisCommand.PowerUp;
		
		ByteBuffer bb = ByteBuffer.allocate(r.getDataWireLength());
		r.toWireData(bb);
		bb.flip();
	
		Assert.assertArrayEquals(byteSequence, bb.array());
	}

	@Test
	public void testUnmarshal() {
		ByteBuffer bb = ByteBuffer.allocate(byteSequence.length);
		bb.put(byteSequence);
		bb.flip();
		
		ChassisControlRequest r = new ChassisControlRequest();
		r.fromWireData(bb);
		
		Assert.assertEquals(ChassisControlRequest.ChassisCommand.PowerUp, r.chassisCommand);
	}
}
