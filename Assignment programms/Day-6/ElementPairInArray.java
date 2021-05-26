/*Finding the element pair that gives the sum of 10*/

package com.onebill.corejava.Day6Assignment;

import java.util.Scanner;

public class ElementPairInArray {

	public static void main(String[] args) {
		
		int[] element = new int[10];
		int n=10;
		int sum = 10;
		
		System.out.println("Enter 10 values ");
        Scanner sc = new Scanner(System.in);
        for(int i =0; i < 10; i++) {
        	element[i] = sc.nextInt(); 
        }
        System.out.println("You entered ");
		for (int i = 0; i < n; i++)
		      System.out.print(element[i]+ " ");
		System.out.println();

		//Pairing all posibilities and comparing the sum.
		for (int i = 0; i < element.length - 1; i++)
	    {
			// start from the i'th element until the last element
	        for (int j = i + 1; j < element.length; j++)
	        {
	        	// if the desired sum is found, print it
	            if (element[i] + element[j] == sum)
	            {
	                System.out.println("Pair found (" + element[i] + ", " + element[j] + ")");
	            }
	         }
	     }
	}

}
