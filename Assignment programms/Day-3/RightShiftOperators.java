/*>> signed right shift operator
 * >>> strict right shift or unsigned right shift
 * when >> is used after shifting the bits to right 
 * in the left 0 will be added for +ve number and 1 for -ve number
 * Whereas in >>> at any case after shifting the bits to right
 * in the left 0 only will be added, so that it will always be positive.*/

package com.onebill.corejava.basics;

public class RightShiftOperators {

	public static void main(String[] args) {
		System.out.println("Right shift of positive number");
		int a = 5;
		System.out.println("Actual value "+a);
	    System.out.println("Binary value of "+a+ " is " +Integer.toBinaryString(a));
	    int a1 = a >> 1;
	    System.out.println("Actual value "+a1);
	    System.out.println("Binary value of "+a+ " is " +Integer.toBinaryString(a1));
	    System.out.println("  ");
	    
	    System.out.println("Right shift of negative number");
	    int b = -5;
		System.out.println("Actual value "+b);
	    System.out.println("Binary value of "+b+ " is " +Integer.toBinaryString(b));
	    int b1 = b >> 1;
	    System.out.println("Actual value "+b1);
	    System.out.println("Binary value of "+b+ " is " +Integer.toBinaryString(b1));
	    System.out.println("  ");
	    
	    System.out.println("Unsigned Right shift of positive number");
		int c = 5;
		System.out.println("Actual value "+c);
	    System.out.println("Binary value of "+c+ " is " +Integer.toBinaryString(c));
	    int c1 = c >>>  1;
	    System.out.println("Actual value "+c1);
	    System.out.println("Binary value of "+c+ " is " +Integer.toBinaryString(c1));
	    System.out.println("  ");
	    
	    System.out.println("Unsigned Right shift of negative number");
	    int d = -5;
		System.out.println("Actual value "+d);
	    System.out.println("Binary value of "+d+ " is " +Integer.toBinaryString(d));
	    int d1 = d >>> 1;
	    System.out.println("Actual value "+d1);
	    System.out.println("Binary value of "+d+ " is " +Integer.toBinaryString(d1));
	    System.out.println("  ");
	}

}
