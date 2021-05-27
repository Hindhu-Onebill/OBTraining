//Customized exception created and used

package com.onebill.corejava.Day7Handson;

import java.util.Scanner;

class CustomException1 extends Exception{

	public CustomException1(String s) {
		super();
	}
	
}

public class ExceptionHandle12 {

	static void divide(int num1,int num2)throws CustomException1{  
	     if(num1 % num2 != 0)
	      throw new CustomException1("Invalid");  
	     else 
	    	 System.out.println("Answer is "+num1/num2);
	   }  
	   public static void main(String args[]){  
		   
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter 2 numbers to divide");
		   int a = sc.nextInt();
		   int b = sc.nextInt();
		   
	      try{  
	    	  divide(a,b);  
	      }catch(Exception e){
	    	  System.out.println("Exception occured ");
	    	  }  
	  
	  }  

}
