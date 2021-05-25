//Floyd's triangle using nested loops

package com.onebill.corejava.Assignmentd5;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		
		int k = 1;
		System.out.println("Enter a value");
		Scanner sc = new Scanner(System.in); 
		int value = sc.nextInt();
		
		for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + "  ");
                k++;
            }
            System.out.println();
        }

	}

}
