package translated.target;

import java.util.Map;

public interface TargetRepository {
	public Target create(Map<String, String> params);
	public Target retrieve(String id);
	public void delete(String id);
}
