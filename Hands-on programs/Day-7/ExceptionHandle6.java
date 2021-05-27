//throw - manually creating an exception

package com.onebill.corejava.Day7Handson;

public class ExceptionHandle6 {

	public static void main(String[] args) {
		try {
			System.out.println("Before ....");
			throw new ArithmeticException(); ///manually thrown
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic exception");
		}

	}

}
