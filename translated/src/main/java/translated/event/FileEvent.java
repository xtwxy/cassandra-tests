package translated.event;

public class FileEvent {
	public FileEvent(int fd, int efd, int tfd) {
		this.fd = fd;
		this.efd = efd;
		this.tfd = tfd;
	}

	public int fd;
	public int efd;
	public int tfd;
}
