//dynamic query processing for insertion

package com.onebill.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DynamicInsert {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;		
		ResultSet rs = null;
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?autoReconnect=true&useSSL=false","root","Onebill@2020");
			String query = "insert into Student values(?,?,?)";
			pstmt = con.prepareStatement(query);
			
			String s_id = args[0];
			String s_name = args[1];
			String s_marks = args[2];
			
			int sid = Integer.parseInt(s_id);
			int smarks = Integer.parseInt(s_marks);
			
			pstmt.setInt(1,sid);
			pstmt.setString(2, s_name);
			pstmt.setInt(3,smarks);
			
			pstmt.executeUpdate();
			System.out.println("Insertion succesful");
			
			
		}catch (SQLException e) {
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
