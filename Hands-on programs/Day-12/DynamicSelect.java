//dynamic query processing for selection

package com.onebill.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DynamicSelect {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;		
		ResultSet rs = null;
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?autoReconnect=true&useSSL=false","root","Onebill@2020");
			String query = "Select * from Student where sid =?";
			pstmt = con.prepareStatement(query);
			
			//reading argument from command line
			String studentid = args[0];
			int student_id = Integer.parseInt(studentid);
			
			//binding the parameter ??
			pstmt.setInt(1, student_id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int Stud_id = rs.getInt("sid");
				String student_Name = rs.getString("sname");
				int student_marks = rs.getInt("marks");

				System.out.println("Student ID :" + Stud_id);
				System.out.println("Student Name :" + student_Name);
				System.out.println("Student Mark :" + student_marks);
			}else {
				System.out.println("No such record..");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null)
					con.close();
				if(pstmt!= null)
					pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
