package cassandra.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.cassandra.core.CqlTemplate;

import com.datastax.driver.core.querybuilder.Delete;
import com.datastax.driver.core.querybuilder.Insert;
import com.datastax.driver.core.querybuilder.QueryBuilder;

import cassandra.tests.util.AppContextLoader;

public class InsertOneTest {

	@Test
	public void test() {
		Insert insert = QueryBuilder.insertInto("history_ai_quarter")
		.value("id", 1)
		.value("ts", System.currentTimeMillis())
		.value("value", Math.random());
		
		cql.execute(insert);
	}
	
	@Before
	public void setUp() {
		ctxLoader = new AppContextLoader();
		cql = ctxLoader.getContext().getBean(CqlTemplate.class);
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
