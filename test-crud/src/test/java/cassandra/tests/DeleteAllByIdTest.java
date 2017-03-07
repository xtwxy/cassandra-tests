package cassandra.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.cassandra.core.CqlTemplate;

import com.datastax.driver.core.querybuilder.Delete.Where;
import com.datastax.driver.core.querybuilder.QueryBuilder;

import cassandra.tests.util.AppContextLoader;

public class DeleteAllByIdTest {

	@Test
	public void test() {
		Where delete = QueryBuilder.delete()
				.from("history_ai_quarter")
				.where(QueryBuilder.eq("id", 1));

		cql.execute(delete);
	}

	@Before
	public void setUp() {
		ctxLoader = new AppContextLoader();
		cql = ctxLoader.getContext().getBean(CqlTemplate.class);
	}

	@After
	public void tearDown() {
		ctxLoader.closeContext();
	}

	private CqlTemplate cql;
	private AppContextLoader ctxLoader;
}
