package com.onebill.corejava.Day7Assignment;

import java.io.FileOutputStream;

public class TryWithResource {

	public static void main(String args[]) {
		// Using try-with-resources
		try (FileOutputStream fileOutputStream = new FileOutputStream("/home/hindhuja/Downloads/Training docs/Java sample programs/Hindhu.txt")) {
			String msg = "Writing a new msg in the file";
			
			byte byteArray[] = msg.getBytes(); // converting string into byte array
			fileOutputStream.write(byteArray);
			System.out.println("Message written to file successfuly!");
			
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}