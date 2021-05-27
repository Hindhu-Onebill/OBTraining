/*try catch*/

package com.onebill.corejava.Day7Handson;

class Exception_Test{
	static void generateException() {
		int[] array = new int[4];
		System.out.println("Before...");
		array[5] = 10;
		System.out.println("After...");
	}
}

public class ExceptionHandle3 {

	public static void main(String[] args) {
		try {
			Exception_Test.generateException();
		}catch(ArithmeticException e) {     //its not arithmetic so by default stacktrace msg is shown
		//catch(ArrayIndexOutOfBoundsException e) {  
			System.err.println("Index error");
		}
		
		System.out.println("Continue other code");
	}

}
