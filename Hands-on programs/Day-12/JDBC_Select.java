//static select query

package com.onebill.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// Step 1
			Class.forName("com.mysql.jdbc.Driver");
			// Step 2 Establish the connection with the database with user and password
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/OneBillStudent?autoReconnect=true&useSSL=false", "root","Onebill@2020");
			// Step 3 Issuing Query
			String query = "select * from Student";
			// Step 4 : Execute and process the query
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				int Student_id = rs.getInt("sid");
				String student_Name = rs.getString("sname");
				int student_marks = rs.getInt("marks");

				System.out.println("Student ID :" + Student_id);
				System.out.println("Student Name :" + student_Name);
				System.out.println("Student Mark :" + student_marks);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Step 5 : Close all the objects
		finally {
			try {
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
