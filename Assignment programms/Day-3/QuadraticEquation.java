/*Solution for quadratic equation*/

package com.onebill.corejava.basics;

import static java.lang.Math.*;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a,b,c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("a = "+a+" b = "+b+" c = "+c);
    	double d = (b * b) - 4 * a * c;
		double sqrtval = sqrt(d);
		
		double sol1 = -b + sqrtval;
		double sol2 = -b - sqrtval;
		
		double denominator = 2 * a;
		
		double ans1 = sol1 / denominator;
		double ans2 = sol2 / denominator;
		
		System.out.println("Roots are "+ans1+ " and "+ans2);
		
	}

}
