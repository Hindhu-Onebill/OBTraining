package com.onebill.corejava.Files;

import java.io.File; 
import java.io.IOException;
 

public class CreateFile {
	public static void main(String[] args) {  
	    try {  
	      File f1 = new File("/home/hindhuja/Documents/Files/Movies.txt");  
	      if (f1.createNewFile()) {  
	        System.out.println("File created: " + f1.getName());  
	        System.out.println("Absolute path: " + f1.getAbsolutePath());  
	      } else {  
	        System.out.println("File already exists."); 
	        System.out.println("Absolute path: " + f1.getAbsolutePath());  
	      }  
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();  
	    }  
	  }  
}

 
