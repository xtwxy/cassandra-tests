package com.wincom.mstar.tests;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.cassandra.core.CqlTemplate;

import com.datastax.driver.core.querybuilder.Delete;
import com.datastax.driver.core.querybuilder.Insert;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.wincom.mstar.domain.HistoryAI;
import com.wincom.mstar.repository.HistoryAIHourRepository;
import com.wincom.mstar.tests.util.AppContextLoader;

public class HistoryAIHourRepositorySelectByIdAndTsRangeTest {
	int count = 0;
	
	@Test
	public void test() {
		Set<Integer> id = new HashSet<>();
		id.add(1);
		Iterable<HistoryAI> rs = repository.findByIdAndDateRange(id, new Date(Long.valueOf(0)), new Date(System.currentTimeMillis()));
		rs.forEach(x -> count += 1);
		Assert.assertEquals(1, count);
	}
	
	@Before
	public void setUp() {
		ctxLoader = new AppContextLoader();
		cql = ctxLoader.getContext().getBean(CqlTemplate.class);
		repository = ctxLoader.getContext().getBean(HistoryAIHourRepository.class);
		
		Insert insert = QueryBuilder.insertInto("history_ai_hour")
		.value("id", 1)
		.value("ts", System.currentTimeMillis())
		.value("value", Math.random());
		
		cql.execute(insert);
	}
	
	@After
	public void tearDown() {
		Delete.Where delete = QueryBuilder.delete()
				.from("history_ai_hour")
				.where(QueryBuilder.eq("id", 1));

		cql.execute(delete);
		
		ctxLoader.closeContext();
	}
	private HistoryAIHourRepository repository;
	private CqlTemplate cql;
	private AppContextLoader ctxLoader;
}
