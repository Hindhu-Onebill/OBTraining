//getconnection method with arguments as a properties file

package com.onebill.corejava.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class OneBillBankInsert1 {
	
	public static void main(String[] args) {
		Properties prop = new Properties();

		Connection con = null;
		Statement stmt = null;		
			try {
				
				prop.load(new FileInputStream("/home/hindhuja/Documents/Files/Data.properties"));
				String user = prop.getProperty("username");
				String pass = prop.getProperty("password");
				
				//Step 1
				Class.forName("com.mysql.jdbc.Driver");
				//Step 2 Establish the connection with the database with user and password
				con = DriverManager.getConnection("jdbc:mysql://localhost/", user, pass);
				// Step 3 Issuing Query
				String query = "insert into OneBillBankDB.Employee values (2,'Hardin',35000)";
				// Step 4 : Execute and process the query
				stmt = con.createStatement();
				int count = stmt.executeUpdate(query);
				System.out.println("Inserted record"+ count);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			//Step 5 : Close all the objects
			finally {
				try {
					if(con!=null)
						con.close();
					if(stmt!= null)
						stmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
	}
}

