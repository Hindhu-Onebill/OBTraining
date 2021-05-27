/*Custom Exception is created to handle exception if return type is not integer*/

package com.onebill.corejava.Day7Assignment;

import java.util.Scanner;

class CustomException1 extends Exception{

	public CustomException1(String s) {
		super();
	}
	
}

public class CustomException {

	static void divide(int num1,int num2)throws CustomException1{  
	     if(num1 % num2 != 0)
	      throw new CustomException1("Invalid");  
	     else 
	    	 System.out.println("Answer is "+num1/num2);
	   }  
	   public static void main(String args[]){  
		   
		   int[] numerator = {3,8,15,24,29,32,44,56,88};
			int[] denominator = {2,0,4,4,0};
			for(int i=0; i<numerator.length; i++) {
	      try{  
	    	  divide(numerator[i],denominator[i]);  
	       }catch(ArithmeticException e) {
				System.out.println("cant divide by zero");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("index limit");
			}catch(CustomException1 e) {                  
				System.out.println("Return type doesn't match");
			}
	  
	  }  

}
}
