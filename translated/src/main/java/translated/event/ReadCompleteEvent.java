package translated.event;

public class ReadCompleteEvent extends FileEvent {
	public ReadCompleteEvent(int fd, int efd, int tfd) {
		super(fd, efd, tfd);
	}
}
