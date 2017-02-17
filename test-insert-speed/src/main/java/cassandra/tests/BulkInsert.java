package cassandra.tests;

import java.util.Arrays;

import me.prettyprint.cassandra.service.CassandraHostConfigurator;
import me.prettyprint.cassandra.service.ThriftKsDef;
import me.prettyprint.hector.api.Cluster;
import me.prettyprint.hector.api.ddl.ColumnFamilyDefinition;
import me.prettyprint.hector.api.ddl.KeyspaceDefinition;
import me.prettyprint.hector.api.factory.HFactory;

public class BulkInsert {
	public static String CLUSTER_NAME = "dcim-cluster";
	public static String CASSANDRA_HOST = "192.168.0.78:9160";
	public static String MONITORDB_KEYSPACE = "monitordb";
	public static int REPLICATION_FACTOR = 3;
	public static String COLUMN_FAMILY_HISTORY_AI = "history_ai";

	public static void main(String[] args) {
		Cluster cluster = HFactory.getOrCreateCluster(CLUSTER_NAME, new CassandraHostConfigurator(CASSANDRA_HOST));
		KeyspaceDefinition keyspaceDef = cluster.describeKeyspace(MONITORDB_KEYSPACE);
		if (keyspaceDef == null) {
			createSchema(cluster);
		}
	}

	private static void createSchema(Cluster cluster) {
		ColumnFamilyDefinition columnFamilyDef = HFactory.createColumnFamilyDefinition(MONITORDB_KEYSPACE,
				COLUMN_FAMILY_HISTORY_AI);
		KeyspaceDefinition keyspace = HFactory.createKeyspaceDefinition(MONITORDB_KEYSPACE,
				ThriftKsDef.NETWORK_TOPOLOGY_STRATEGY, REPLICATION_FACTOR, Arrays.asList(columnFamilyDef));
		cluster.addKeyspace(keyspace, true);
	}

}
