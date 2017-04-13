package translated.target;

import java.util.List;

public interface Target {
	public String name();
	public String type();
	public List<Criteria> depends();
	public List<Action> exections();
}
