package translated.event;

public class WriteCompleteEvent extends FileEvent {
	public WriteCompleteEvent(int fd, int efd, int tfd) {
		super(fd, efd, tfd);
	}
}
