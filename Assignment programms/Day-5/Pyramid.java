//Pattern printing

package com.onebill.corejava.Assignmentd5;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		System.out.println("Enter a value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++)
        {
 
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=n-i; j>1; j--)
            {
                // printing spaces
                System.out.print("  ");
            }
  
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("   "+(i+1));
            }
  
            // ending line after each row
            System.out.println();
        }

	}

}
