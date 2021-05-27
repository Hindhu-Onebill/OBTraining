//throws is used with method when u dynamically get an input but know may be it will have an exception

package com.onebill.corejava.Day7Handson;

import java.util.Scanner;

class ThrowsDemo{
	void division(int variable1,int variable2)throws ArithmeticException {
		System.out.println("Quotient is "+variable1 / variable2);
	}
}

public class ExceptionHandle8 {

	public static void main(String[] args) {
		
		ThrowsDemo obj = new ThrowsDemo();
		int variable1,variable2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numerator");
		variable1 = sc.nextInt();
		
		System.out.println("Enter denominator");
		variable2 = sc.nextInt();
		
		try {
		obj.division(variable1, variable2);
		}catch(Exception e) {
			System.out.println("Cannot be divided by zero");
		}

	}

}
