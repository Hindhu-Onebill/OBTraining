/*Reversing the elements of an array*/

package com.onebill.corejava.Day6Assignment;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] element = new int[5];
		int[] reverseElement = new int[5];
		int n = 5;
		
		System.out.println("Enter 5 values ");
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<5; i++) {
        	element[i] = sc.nextInt(); 
        }
        System.out.println("You entered ");
		  for (int i = 0; i < n; i++)
		        System.out.print(element[i]+ " ");
		    System.out.println();
		  
		int j =0;    
		System.out.println("Reversed array ");
		for(int i = n-1; i>=0; i--) {
			reverseElement[j] = element[i];
			j++;	
		}
		for (int i = 0; i < n; i++)
	        System.out.print(reverseElement[i]+ " ");
	    System.out.println();

	}

}
