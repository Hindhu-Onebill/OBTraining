package com.onebill.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ExternalFileInput {
	 static Connection con =null;
	 static PreparedStatement pstmt =null;
	public static void main(String[] args) {
		
	try {
    	
    	Class.forName("com.mysql.jdbc.Driver");
    	
    	//2. getConnection using (String url, String user,String password)
        String db_url ="jdbc:mysql://localhost:3306/OneBillStudent";
        String user = "root";
        String password ="Onebill@2020";
    	con =DriverManager.getConnection(db_url,user,password);
    	
        String query ="insert into Student values(?,?,?)";
        pstmt =con.prepareStatement(query);
        FileReader fr =new FileReader("/home/hindhuja/Documents/Files/JDBC.txt");
        BufferedReader br =new BufferedReader(fr);
        String[] record =null;
        String line;
        while((line =br.readLine())!=null){
        	record =line.split(" ");
        }
        String sid=record[0];
		String sname =record[1];
		String marks =record[2];
		int s_id = Integer.parseInt(sid);
		int s_marks =Integer.parseInt(marks);
		pstmt.setInt(1, s_id);
		pstmt.setString(2, sname);
		pstmt.setInt(3, s_marks);
		pstmt.executeUpdate();
		System.out.println("Insertion Successfully");
		
        }catch(Exception e) {
        	System.out.println("Exception");
        }
	  finally {
		  try {
   		   if(con!=null)
   			   con.close();
   		   if(pstmt!=null)
   			   pstmt.close();
   	      }catch(SQLException e) {
   		   e.printStackTrace();
   	      }
	  }
	}
	}