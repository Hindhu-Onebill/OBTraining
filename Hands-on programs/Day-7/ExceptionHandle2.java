//Simple try catch

package com.onebill.corejava.Day7Handson;

class ExceptionTest{
	static void generateException() {
		int[] array = new int[4];
		System.out.println("Before...");
		array[5] = 10;
		System.out.println("After...");
	}
}

public class ExceptionHandle2 {

	public static void main(String[] args) {
		try {
			ExceptionTest.generateException();
		}catch(Exception e) {    //catch(Throwable e) /since it is super class for exception
			System.err.println("Index error");
		}
		
		System.out.println("Continue other code");
	}

}
