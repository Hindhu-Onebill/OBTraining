/*Squares of numbers using two dimensional array*/

package com.onebill.corejava.d6handson;

public class Squares {

	public static void main(String[] args) {
		int arr[][] = new int[10][2]; // 10 rows 2 columns
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][0] = i+1;
				arr[i][1] = (i+1) * (i+1); 
				System.out.print(arr[i][j]+ "   ");
			}
			System.out.println(" ");
		}

	}

}
