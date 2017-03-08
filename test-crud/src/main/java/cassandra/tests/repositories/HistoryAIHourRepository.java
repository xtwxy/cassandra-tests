package cassandra.tests.repositories;

import java.util.Date;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import cassandra.tests.domain.HistoryAI;

public interface HistoryAIHourRepository extends CrudRepository<HistoryAI, Integer> {
	@Query("select id, ts, value from history_ai_hour where id in (?0) and ts >= ?1 and ts < ?2")
	Iterable<HistoryAI> findByIdAndDateRange(Iterable<Integer> id, Date begin, Date end);
}
