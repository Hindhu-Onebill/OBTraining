//table creation using jdbc

package com.onebill.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	private static final String CREATE_TABLE_SQL = "CREATE TABLE OneBillBankDB.Employee (" + "EmpId INT NOT NULL,"
			+ "EmpName VARCHAR(45) NOT NULL," + "Salary INT NOT NULL,"
			+ "PRIMARY KEY (EmpId))";

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost/";
		String username = "root";
		String password = "Onebill@2020";

		Connection conn = null;
		Statement stmt = null;

		try {

			conn = DriverManager.getConnection(jdbcUrl, username, password);
			stmt = conn.createStatement();

			stmt.executeUpdate(CREATE_TABLE_SQL);

			System.out.println("Table created");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close connection
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
