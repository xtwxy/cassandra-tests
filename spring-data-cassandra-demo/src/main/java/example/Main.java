package example;

import org.springframework.cassandra.core.CqlOperations;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Statement;
import com.datastax.driver.core.querybuilder.Insert;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;
import com.datastax.driver.core.utils.UUIDs;
import com.google.common.collect.ImmutableSet;

public class Main {

	public static void main(String[] args) {
		CqlOperations cqlTemplate = null;

		cqlTemplate.execute("insert into event (id, type, bucket, tags) values (" + UUIDs.timeBased()
				+ ", 'type1', '2014-01-01', {'tag2', 'tag3'})");

		Insert insert1 = QueryBuilder.insertInto("event").value("id", UUIDs.timeBased()).value("type", "type2")
				.value("bucket", "2014-01-01").value("tags", ImmutableSet.of("tag1"));
		cqlTemplate.execute(insert1);

		Statement insert2 = cqlTemplate.getSession()
				.prepare("insert into event (id, type, bucket, tags) values (?, ?, ?, ?)")
				.bind(UUIDs.timeBased(), "type2", "2014-01-01", ImmutableSet.of("tag1", "tag2"));
		cqlTemplate.execute(insert2);

		ResultSet rs1 = cqlTemplate.query("select * from event where type='type2' and bucket='2014-01-01'");

		Select select = QueryBuilder.select().from("event").where(QueryBuilder.eq("type", "type1"))
				.and(QueryBuilder.eq("bucket", "2014-01-01")).limit(10);
		ResultSet rs2 = cqlTemplate.query(select);
	}

}
