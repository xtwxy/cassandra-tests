package com.wincom.mstar.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.cassandra.core.CqlTemplate;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.querybuilder.Delete;
import com.datastax.driver.core.querybuilder.Insert;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;
import com.wincom.mstar.tests.util.AppContextLoader;

public class SelectByIdAndTimestampRangeTest {

	@Test
	public void test() {
		Select.Where select = QueryBuilder.select("id", "ts", "value")
				.from("history_ai_quarter")
				.where(QueryBuilder.eq("id", 1))
				.and(QueryBuilder.gte("ts", 0))
				.and(QueryBuilder.lte("ts", System.currentTimeMillis()));
		
		ResultSet rs = cql.query(select.limit(100));
		Assert.assertTrue(!rs.all().isEmpty());
	}
	
	@Before
	public void setUp() {
		ctxLoader = new AppContextLoader();
		cql = ctxLoader.getContext().getBean(CqlTemplate.class);
		
		Insert insert = QueryBuilder.insertInto("history_ai_quarter")
		.value("id", 1)
		.value("ts", System.currentTimeMillis())
		.value("value", Math.random());
		
		cql.execute(insert);
	}
	
	@After
	public void tearDown() {
		Delete.Where delete = QueryBuilder.delete()
				.from("history_ai_quarter")
				.where(QueryBuilder.eq("id", 1));

		cql.execute(delete);

		ctxLoader.closeContext();
	}
	private CqlTemplate cql;
	private AppContextLoader ctxLoader;
}
