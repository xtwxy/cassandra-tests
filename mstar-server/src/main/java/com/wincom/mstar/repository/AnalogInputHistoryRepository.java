package com.wincom.mstar.repository;

import java.util.Date;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wincom.mstar.domain.AnalogInputHistory;
import com.wincom.mstar.domain.HistoryKey;

public interface AnalogInputHistoryRepository extends CrudRepository<AnalogInputHistory, HistoryKey> {
	@Query("select id, ts, value from analog_input_history where id in (:ids) and ts >= :begin and ts < :end")
	Iterable<AnalogInputHistory> findByIdsAndDateRange(Iterable<HistoryKey> ids, Date begin, Date end);
}
