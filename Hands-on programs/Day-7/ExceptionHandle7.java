//manually thrown exception outside try catch

package com.onebill.corejava.Day7Handson;

public class ExceptionHandle7 {

	static void validate(int age) {
		if(age < 18)
			throw new ArithmeticException();
		else 
			System.out.println("Welcome to cast!");
	}
	
	public static void main(String[] args) {
		try {
		validate(13);
		}catch(ArithmeticException e) {
			System.out.println("Age not valid");
		}

		System.out.println("Other logic");
	}

}
