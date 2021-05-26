/*Inserting the element at a specific index*/

package com.onebill.corejava.Day6Assignment;

import java.util.Scanner;

public class InsertElementInArray {

	public static void main(String[] args) {
		
		 int arr[] = new int[100]; 
		  int i, x, pos, n = 5;
		    
		System.out.println("Enter marks of 5 subjets");
		Scanner sc = new Scanner(System.in);
		
		 for (i = 0; i < 5; i++)
		        arr[i] = sc.nextInt();
		 
		 System.out.println("You entered ");
		  for (i = 0; i < n; i++)
		        System.out.print(arr[i]+ " ");
		    System.out.println();
		
		System.out.println("Enter at which position you want to add ");
	    pos = sc.nextInt();
		System.out.println("What value you would like add? ");
		x = sc.nextInt();
		 
		
		n++;
		for (int j = n; j >= pos; j--)
		   arr[j] = arr[j - 1];
		  
		   // insert x at pos
		 arr[pos - 1] = x;
		
		 System.out.println("Inserted successfully!!");
		 System.out.println("Array after insertion");
		 for (i = 0; i < n; i++)
		        System.out.print(arr[i]+ " ");
		}
	}


