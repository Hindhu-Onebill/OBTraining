package com.onebill.corejava.Assignmentd5;

import java.util.Scanner;

public class PascalsTriangle {

	public int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
    public static void main(String[] args)
    {
    	System.out.println("Enter a value ");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int i, j;
        PascalsTriangle obj = new PascalsTriangle();
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
 
                // for left spacing
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
 
                // nCr formula
                System.out.print(
                    " "
                    + obj.factorial(i)
                          / (obj.factorial(i - j)
                             * obj.factorial(j)));
            }
 
            // for newline
            System.out.println();
        }
    }
}
