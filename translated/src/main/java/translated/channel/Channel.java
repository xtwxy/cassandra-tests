package translated.channel;

public interface Channel {
	public void onRead(byte[] b);
	public void write(byte[] b);
	public void close();
	public void timeout();	
	public Pipeline pipeline();	
}
