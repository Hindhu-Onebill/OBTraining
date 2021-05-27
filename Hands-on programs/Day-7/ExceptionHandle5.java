/*Nested try blocks: inner try also must have catch block
 * and outer try block also must have catch block*/

package com.onebill.corejava.Day7Handson;

public class ExceptionHandle5 {

	public static void main(String[] args) {
		int[] numerator = {4,8,16,24,28,32,44,56,88};
		int[] denominator = {2,0,4,4,0};
		
		try {//outer try
			for(int i=0; i<numerator.length; i++) {
				
				try {//inner try
					System.out.println(numerator[i]+ " / " +denominator[i]+ " is " +numerator[i]/denominator[i] );
				}catch(ArithmeticException e) {
					System.out.println("cant divide by zero");
				}
				
			}//end of for
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index limit");
		}

	}

}
