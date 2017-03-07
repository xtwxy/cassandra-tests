package example;

import org.springframework.cassandra.core.CqlOperations;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.datastax.driver.core.querybuilder.Insert;
import com.datastax.driver.core.querybuilder.QueryBuilder;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		CqlOperations cqlTemplate = (CqlOperations)context.getBean("cassandraTemplate");
	
		Insert insert = QueryBuilder.insertInto("history_ai_quarter")
		.value("id", 1)
		.value("ts", System.currentTimeMillis())
		.value("value", Math.random());
		
		cqlTemplate.execute(insert);
		
		context.close();
	}

}
