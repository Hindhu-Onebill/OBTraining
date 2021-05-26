/*Array reference, created two array then referring array1 = array2*/

package com.onebill.corejava.Day6Assignment;

import java.util.Scanner;

public class ArrayReference {

	public static void main(String[] args) {
		
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values of first array");
		for(int i = 0; i < 5; i++) {
			num1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the values of second array");
		for(int i = 0; i < 5; i++) {
			num2[i] = sc.nextInt();
		}

		System.out.println("array 1");
		for(int i = 0; i < 5; i++) {
			System.out.print(num1[i]+ " ");
		}
		System.out.println();
		System.out.println("Array 2");
		for(int i = 0; i < 5; i++) {
			System.out.print(num2[i]+ " ");
		}
		
		System.out.println();
		num2 = num1;
		System.out.println("Array 2 after reference");
		for(int i = 0; i < 5; i++) {
			System.out.print(num2[i]+ " ");
		}
		
		num2[3] = 40;
		System.out.println();
		System.out.println("Changed a value in second array after reference");
		for(int i = 0; i < 5; i++) {
			System.out.print(num2[i]+ " ");
		}
		
	}

}
