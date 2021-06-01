//Creation and writing in properties file

package com.onebill.corejava.Files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class CreatePropFile {
	 public static void main(String args[]) throws IOException {
	      //Instantiating the properties file
	      Properties props = new Properties();
	      //Populating the properties file
	      props.put("Mercedes-Benz", "10");
	      props.put("BMW", "9");
	      props.put("Kia", "15");
	      //Instantiating the FileInputStream for output file
	      String path = "/home/hindhuja/Documents/Files/Price.properties";
	      FileOutputStream outputStream = new FileOutputStream(path);
	      //Storing the properties file
	      props.store(outputStream, "This is a sample properties file");
	      System.out.println("Properties file created......");
	   }
}
