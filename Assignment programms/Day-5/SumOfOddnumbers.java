package com.onebill.corejava.Assignmentd5;

import java.util.Scanner;

public class SumOfOddnumbers {

	public static void main(String[] args) {
		
		int sum =0;
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		for(int i = 1; i <= value; i++) {
			if(i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("The sum of all odd natural numbers till "+value+ " is "+sum);
		
	}

}
