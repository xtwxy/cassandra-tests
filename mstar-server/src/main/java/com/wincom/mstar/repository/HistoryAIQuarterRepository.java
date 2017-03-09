package com.wincom.mstar.repository;

import java.util.Date;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wincom.mstar.domain.HistoryAI;

public interface HistoryAIQuarterRepository extends CrudRepository<HistoryAI, Integer> {
	@Query("select id, ts, value from history_ai_quarter where id in (?0) and ts >= ?1 and ts < ?2")
	Iterable<HistoryAI> findByIdAndDateRange(Iterable<Integer> id, Date begin, Date end);
}
