package com.onebill.corejava.Assignmentd5;

import java.util.Scanner;

public class OrderOfNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter 3 values");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1 > num2) {
			if(num2 > num3) {
				System.out.println("Decreasing");
			}
			else
				System.out.println("Neither increasing, Nor decreasing ");
		}
		else {
			System.out.println("Increasing");
		}
	}

}
