package com.wincom.mstar.repository;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import com.wincom.mstar.domain.AnalogInputHistory;
import com.wincom.mstar.domain.HistoryKey;

public interface AnalogInputHistoryRepository extends CrudRepository<AnalogInputHistory, HistoryKey> {
	Iterable<AnalogInputHistory> findByIdsAndDateRange(Iterable<HistoryKey> ids, Date begin, Date end);
}
