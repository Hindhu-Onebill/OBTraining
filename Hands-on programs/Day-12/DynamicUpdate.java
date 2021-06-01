//dynamic update query

package com.onebill.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DynamicUpdate {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;		
		ResultSet rs = null;
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?autoReconnect=true&useSSL=false","root","Onebill@2020");
			String query = "update Student set sname=?,marks=? where sid=3";
			pstmt = con.prepareStatement(query);
			
			String newname = args[0];			
			int smarks = Integer.parseInt(args[1]);
			
			pstmt.setString(1, newname);
			pstmt.setInt(2,smarks);
			
			pstmt.executeUpdate();
			System.out.println("Updation succesful");
			
			
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
