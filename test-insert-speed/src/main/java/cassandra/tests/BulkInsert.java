package cassandra.tests;

import java.util.Date;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

public class BulkInsert {
	public static final int MAX_IDS = 200000;
	public static final int MAX_COUNT = 20000;
	public static final int THREAD_COUNT = 25;
	public static Cluster cluster = null;

	public static void main(String[] args) {
		try {
			cluster = Cluster.builder() // (1)
					.addContactPoint("192.168.0.78")
					.withClusterName("dcim-cluster").build();

			final int SLICE = MAX_IDS / THREAD_COUNT;
			Thread[] threads = new Thread[THREAD_COUNT];
			for (int i = 0; i < THREAD_COUNT; ++i) {
				final int idx = i;
				threads[idx] = new Thread() {
					public void run() {
						executeInsert(cluster, idx * SLICE);
					}
				};
				threads[idx].start();
			}
			for (int i = 0; i < THREAD_COUNT; ++i) {
				try {
					threads[i].join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} finally {
			if (cluster != null)
				cluster.close(); // (5)
		}
	}

	private static void executeInsert(Cluster cluster, final int startPos) {
		Session session = cluster.connect("monitordb"); // (2)

		ResultSet rs = session.execute("select release_version from system.local"); // (3)
		Row row = rs.one();
		System.out.println(row.getString("release_version")); // (4)

		PreparedStatement ps = session.prepare("insert into history_ai(id, ts, value) values (?, ?, ?)");
		for (int id = 20000; id < MAX_IDS; ++id) {
			long ts1 = System.currentTimeMillis();
			for (int i = 0; i < MAX_COUNT; ++i) {
				BoundStatement bs = ps.bind(Long.valueOf(id), new Date().getTime(), Math.random());
				session.execute(bs);
			}
			long ts2 = System.currentTimeMillis();
			System.out.println("rows per second: " + MAX_COUNT / ((ts2 - ts1) / 1000.0));
		}
	}

}
