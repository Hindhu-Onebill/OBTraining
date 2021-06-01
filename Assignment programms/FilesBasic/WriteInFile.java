package com.onebill.corejava.Files;

import java.io.FileWriter;   
import java.io.IOException; 

public class WriteInFile {

	public static void main(String[] args) {
		 try {
		      FileWriter myWriter = new FileWriter("/home/hindhuja/Documents/Files/Movies.txt");
		      myWriter.write("The imitation game||Harry Potter");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
