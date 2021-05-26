/*Finding duplicate element using two loops*/

package com.onebill.corejava.Day6Assignment;

import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {
		
		int[] duplicate = new int[5];
		
		System.out.println("Enter 5 values");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i< 5; i++) {
			duplicate[i] = sc.nextInt();
		}
		
		System.out.println("You entered ");
		  for (int i = 0; i < 5; i++)
		        System.out.print(duplicate[i]+ " ");
		    System.out.println();
		  
		System.out.println("Repeating elements");
		for(int i =0; i < 5; i++) {
			for(int j= i+1; j < 5; j++) {
				if(duplicate[i] == duplicate[j])
					System.out.println(duplicate[i]+ " ");
			}
		}

	}

}
