/*One try block with multiple catch blocks*/

package com.onebill.corejava.Day7Handson;

public class ExceptionHandle4 {

	public static void main(String[] args) {
		
		int[] numerator = {4,8,16,24,28,32,44,56,88};
		int[] denominator = {2,0,4,4,0};
		for(int i=0; i<numerator.length; i++) {
			try {
				System.out.println(numerator[i]+ " / " +denominator[i]+ " is " +numerator[i]/denominator[i] );
			}catch(ArithmeticException e) {
				System.out.println("cant divide by zero");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("index limit");
			}catch(Exception e) {                   //superclass at end
				System.out.println("General exception");
			}
		}

	}

}
