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
import com.wincom.mstar.repository.HistoryAIYearRepository;
import com.wincom.mstar.tests.util.AppContextLoader;

public class HistoryAIYearRepositorySelectByIdAndTsRangeTest {
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
		repository = ctxLoader.getContext().getBean(HistoryAIYearRepository.class);
		
		Insert insert = QueryBuilder.insertInto("history_ai_year")
		.value("id", 1)
		.value("ts", System.currentTimeMillis())
		.value("value", Math.random());
		
		cql.execute(insert);
	}
	
	@After
	public void tearDown() {
		Delete.Where delete = QueryBuilder.delete()
				.from("history_ai_year")
				.where(QueryBuilder.eq("id", 1));

		cql.execute(delete);
		
		ctxLoader.closeContext();
	}
	private HistoryAIYearRepository repository;
	private CqlTemplate cql;
	private AppContextLoader ctxLoader;
}
