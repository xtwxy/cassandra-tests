package ipmi.test;

import io.netty.example.udt.echo.message.MsgEchoClient;
import io.netty.example.udt.echo.message.MsgEchoServer;

public class Main {

	public static void main(String[] args) throws Exception {
		if (args.length >= 1) {
			String clientOrServer = args[0];
			if ("server".equalsIgnoreCase(clientOrServer)) {
				if (args.length < 2) {
					usage();
				} else {
					Integer port = Integer.valueOf(args[1]);
					Server server = new Server(port);
					server.start();
				}
			} else if ("client".equalsIgnoreCase(clientOrServer)) {
				Client client = new Client();
				client.start();
			} else if ("echo-client".equalsIgnoreCase(clientOrServer)) {
				MsgEchoClient.main(args);
			} else if ("echo-server".equalsIgnoreCase(clientOrServer)) {
				MsgEchoServer.main(args);
			} else {
				usage();
			}
		} else {
			usage();
		}
	}

	public static void usage() {
		System.out.println("Usage: \n" 
				+ "<CMD> server <port>\n"
				+ "or \n" 
				+ "<CMD> client\n");
	}
}
