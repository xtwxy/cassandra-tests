package translated.event;

public class CloseEvent extends FileEvent {
	public CloseEvent(int fd, int efd, int tfd) {
		super(fd, efd, tfd);
	}
}
