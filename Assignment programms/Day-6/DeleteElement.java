/*Deleting a particular element from the array*/

package com.onebill.corejava.Day6Assignment;

import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
		int arr[] = new int[6];
        int n = 6;
        		
        System.out.println("Enter 6 values ");
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<6; i++) {
        	arr[i] = sc.nextInt(); 
        }
        
        System.out.println("You entered ");
		  for (int i = 0; i < n; i++)
		        System.out.print(arr[i]+ " ");
		    System.out.println();
        
        System.out.println("Which value would you like to delete?  ");
		int x = sc.nextInt();

		int j;
		//search the value in array
		for (j=0; j<n; j++)
            if (arr[j] == x)
                break;
  
        // If x found in array
        if (j < n)
        {
            // reduce size of array and move all elements on space ahead
            n = n - 1;
            for (int k=j; k<n; k++)
                arr[k] = arr[k+1];
        }
        System.out.println("Successfully deleted ");
        System.out.println("After deletion ");
		  for (int i = 0; i < n; i++)
		        System.out.print(arr[i]+ " ");
		    System.out.println();
      
	}

}
