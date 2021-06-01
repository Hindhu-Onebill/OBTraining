//dynamic query processing for insertion

package com.onebill.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DynamicDelete {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;		
		ResultSet rs = null;
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?autoReconnect=true&useSSL=false","root","Onebill@2020");
			String query = "delete from Student where sid=?";
			pstmt = con.prepareStatement(query);
			
			String s_id = args[0];
			
			int sid = Integer.parseInt(s_id);
			
			pstmt.setInt(1,sid);
			
			pstmt.executeUpdate();
			System.out.println("Deletion succesful");
			
			
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
