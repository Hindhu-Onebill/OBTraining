/*Searching a particular element in an array*/

package com.onebill.corejava.Day6Assignment;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		int[] array = new int[10];
		int n=10;
		int flag = 0;
		
		System.out.println("Enter 10 values ");
        Scanner sc = new Scanner(System.in);
        for(int i =0; i < 10; i++) {
        	array[i] = sc.nextInt(); 
        }
        System.out.println("Enter the element to be searched  ");
		int value = sc.nextInt();

		for(int i =0; i < n; i++)
		{
			if(array[i] == value)
			{
				flag = 1;
				break;
			}
			else 
				flag = 0;
		}
		if(flag == 1)
			System.out.println("Element "+value+ " is found");
		else
			System.out.println("Not found");
	}

}
