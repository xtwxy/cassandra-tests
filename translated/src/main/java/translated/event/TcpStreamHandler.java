package translated.event;

import translated.channel.Channel;

public class TcpStreamHandler implements FileEventHandler {
	public TcpStreamHandler() {
		this.channel = new Channel() {
			public void onRead(byte[] b) { }
			public void write(byte[] b) { }
			public void close() { }
			public void timeout() { }
		};
	}
	public void onEvent(FileEvent fe) {
		byte[] bytes = null;
		channel.onRead(bytes);
		channel.timeout();
		channel.close();
		channel.write(bytes);
	}
	public void write(byte[] b) {
	}
	
	public void close() {
	}

	public void timeout() {
	}

	private Channel channel;
}
