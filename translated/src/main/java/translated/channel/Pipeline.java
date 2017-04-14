package translated.channel;
import translated.codec.Codec;

public interface Pipeline {
	public Pipeline addLast(Codec codec);
}
