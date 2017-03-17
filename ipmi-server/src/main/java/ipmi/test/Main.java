package ipmi.test;

public class Main {

	public static void main(String[] args) throws Exception {
		if (args.length >= 1) {
			String clientOrServer = args[0];
			if ("server".equalsIgnoreCase(clientOrServer)) {
				if (args.length == 1) {
					usage();
				} else if(args.length == 2){
					Integer port = Integer.valueOf(args[1]);
					IpmiServerImpl server = new IpmiServerImpl(port);
					server.start();
				} else {
					usage();
				}
			} else if ("client".equalsIgnoreCase(clientOrServer)) {
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
