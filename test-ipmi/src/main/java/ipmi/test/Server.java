package ipmi.test;

public class Server {
	private Integer port;

	public Server(Integer port) {
		this.port = port;
	}

	public void start() {
		System.out.println("server started with port = " + port + ".");
	}
}
