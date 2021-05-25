//Cube of numbers starting from 1 till user's input number

package com.onebill.corejava.Assignmentd5;

import java.util.Scanner;

public class CubeOfNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter a value");
		Scanner sc = new Scanner(System.in); 
		int value = sc.nextInt();
		
		for (int i = 1; i <= value; i++)
		{
			int result = i * i * i;
			System.out.println(result);
		}
	}

}
