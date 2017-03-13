/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.client.netty;

import java.io.IOException;

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
    }
}
