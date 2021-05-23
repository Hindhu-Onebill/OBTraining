package com.onebill.corejava.basics;

public class EvaluateExpressions {

	public static void main(String[] args) {
		int a = 5,b = 2,c = 1;
		int m = ++a * 5;
		int n = b++ - c * 2;
		
		System.out.println("The value of m is "+m);
		System.out.println("The value of n is "+n);
		
		int x = 10,y = 2, p = 2;
		p *= x/y; // p = p * x / y;
		
		System.out.println("The value of p is "+p);
	}

}
