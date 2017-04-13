package translated.target;

import java.util.HashMap;
import java.util.Map;

public class TargetRepositoryImpl implements TargetRepository {
	private Map<String, Target> targets = new HashMap<>();
	
	@Override
	public Target create(Map<String, String> params) {
		String targetName = params.get("targetName");
		String targetType = params.get("targetType");
		
		return null;
	}

	@Override
	public Target retrieve(String id) {
		return targets.get(id);
	}

	@Override
	public void delete(String id) {
		targets.remove(id);
	}

}
