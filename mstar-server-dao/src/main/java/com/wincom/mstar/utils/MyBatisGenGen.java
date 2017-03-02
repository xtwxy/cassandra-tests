package com.wincom.mstar.utils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MyBatisGenGen {

	public static void main(String[] args) throws Exception {
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:jtds:sqlserver://113.108.158.20:1433/nfjd502", "sa",
				"Wincom2016");
		DatabaseMetaData dbMetaData = conn.getMetaData();

		ResultSet catalogsRs = dbMetaData.getCatalogs();
		printResultSet(catalogsRs, catalogsRs.getMetaData());
		catalogsRs.close();

		ResultSet tableTypesRs = dbMetaData.getTableTypes();
		printResultSet(tableTypesRs, tableTypesRs.getMetaData());
		tableTypesRs.close();

		ResultSet energyTablesRs = dbMetaData.getTables("Energy", "dbo", null, new String[] { "TABLE", "VIEW" });
		//printResultSet(energyTablesRs, energyTablesRs.getMetaData());
		printGeneratorDirectives(energyTablesRs, energyTablesRs.getMetaData());
		energyTablesRs.close();

		ResultSet nfjdTablesRs = dbMetaData.getTables("nfjd502", "dbo", null, new String[] { "TABLE", "VIEW" });
		//printResultSet(nfjdTablesRs, nfjdTablesRs.getMetaData());
		printGeneratorDirectives(nfjdTablesRs, nfjdTablesRs.getMetaData());
		nfjdTablesRs.close();

		conn.close();

	}

	private static void printResultSet(ResultSet catalogsRs, ResultSetMetaData rsMetaData) throws SQLException {
		final int COLUMN_COUNT = rsMetaData.getColumnCount();

		for (int i = 1; i <= COLUMN_COUNT; ++i) {
			System.out.print(rsMetaData.getColumnName(i));
			System.out.print(", ");
		}
		System.out.println();
		
		while (catalogsRs.next()) {
			for (int i = 1; i <= COLUMN_COUNT; ++i) {
				String columnValueString = catalogsRs.getObject(i) == null ? "" : catalogsRs.getObject(i).toString();
				System.out.print(columnValueString);
				System.out.print(", ");
			}
			System.out.println();
		}
	}
	
	private static void printGeneratorDirectives(ResultSet catalogsRs, ResultSetMetaData rsMetaData) throws SQLException {
		while (catalogsRs.next()) {
			System.out.print("<table catalog=\"" + catalogsRs.getString("TABLE_CAT") + "\""
					+ " schema=\"" + catalogsRs.getString("TABLE_SCHEM") + "\""
					+ " tableName=\"" + catalogsRs.getString("TABLE_NAME") + "\""
					+ " domainObjectName=\"" + catalogsRs.getString("TABLE_NAME") + "\""
					+ " />");
			System.out.println();
		}
	}

}
