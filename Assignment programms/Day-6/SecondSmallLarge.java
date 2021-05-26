/*Finding the second largest and second smallest element in an array
 * First sorted all the elements then retrieved the numbers*/

package com.onebill.corejava.Day6Assignment;

import java.util.Scanner;

public class SecondSmallLarge {

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
        }
        System.out.println("Second Largest:"+array[n-2]);

        System.out.println("Second Smallest:"+array[1]);
	}

}
