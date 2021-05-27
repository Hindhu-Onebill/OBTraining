/*finally- whatever happen this block will be executed*/

package com.onebill.corejava.Day7Handson;

public class ExceptionHandle10 {

	public static void main(String[] args) {
		int[] array = new int[4];
		
		try {
		System.out.println("Before...");
		array[5] = 10;
		System.out.println("Afetr...");
		}catch(Exception e) {
			System.err.println("Bound error"); // shows as normal
		}finally {
			System.out.println("Close all database");
		}

	}

}
