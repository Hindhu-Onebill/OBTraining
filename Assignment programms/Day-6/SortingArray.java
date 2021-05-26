/*Sorting elements of an array*/

package com.onebill.corejava.Day6Assignment;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		int[] array = new int[5];
		int n=5,temp;
		
		System.out.println("Enter 5 values ");
        Scanner sc = new Scanner(System.in);
        
        for(int i =0; i<5; i++) {
        	array[i] = sc.nextInt(); 
        }
        
        System.out.println("You entered ");
		for (int i = 0; i < 5; i++)
		      System.out.print(array[i]+ " ");
		System.out.println();
		
		System.out.println("After Sorting");
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (array[i] > array[j]) 
                {
                    temp = array[i];

                    array[i] = array[j];

                    array[j] = temp;
                }
            }
            System.out.print(array[i]+ " ");
        }
	}
}
