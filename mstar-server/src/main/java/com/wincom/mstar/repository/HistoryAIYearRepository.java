package com.wincom.mstar.repository;

import java.util.Date;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wincom.mstar.domain.HistoryAI;

public interface HistoryAIYearRepository extends CrudRepository<HistoryAI, Integer> {
	@Query("select id, ts, value from history_ai_year where id in (?0) and ts >= ?1 and ts < ?2")
	Iterable<HistoryAI> findByIdAndDateRange(Iterable<Integer> ids, Date begin, Date end);
}
