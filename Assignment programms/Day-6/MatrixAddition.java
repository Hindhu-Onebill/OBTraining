//Matrix addition

package com.onebill.corejava.Day6Assignment;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tha values of first 3*3 matrix");
		for(int i =0; i < 3; i++) {
			for(int j =0; j< 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter tha values of second 3*3 matrix");
		for(int i =0; i < 3; i++) {
			for(int j =0; j< 3; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		for(int i =0; i < 3; i++) {
			for(int j =0; j< 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("After addition");
		for(int i =0; i < 3; i++) {
			for(int j =0; j< 3; j++) {
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
