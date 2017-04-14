package translated.target;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TargetRepositoryImpl implements TargetRepository {
	private Map<String, Target> repository = new HashMap<>();
	
	@Override
	public Target create(Map<String, Object> params) {
    	String targetName = (String)params.get("targetName");
		String targetType = (String)params.get("targetType");
		Map<String, Object> dl = (Map<String, Object>) params.get("depends");
        for (Map.Entry<String, Object> e : dl.entrySet()) {
            Criteria c = createCriteria(e.getKey(), e.getValue());
        }
		return null;
	}

	private Criteria createCriteria(String key, Object value) {
		return null;
	}

	@Override
	public Target retrieve(String id) {
		return repository.get(id);
	}

	@Override
	public void delete(String id) {
		repository.remove(id);
	}

}
