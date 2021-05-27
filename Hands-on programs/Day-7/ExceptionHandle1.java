/*Exception handling using try catch method*/

package com.onebill.corejava.Day7Handson;

public class ExceptionHandle1 {

	public static void main(String[] args) {
		int[] array = new int[4];
		
		try {
		System.out.println("Before...");
		array[5] = 10;
		System.out.println("Afetr...");
		}catch(Exception e) {
			System.err.println("Bound error"); // shows in red color err
			System.out.println("Bound error"); // shows as normal
		}

	}

}
