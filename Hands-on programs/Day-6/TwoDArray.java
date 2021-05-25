//Two dimensional array

package com.onebill.corejava.d6handson;

public class TwoDArray {

	public static void main(String[] args) {
		int array[][] = new int[3][4];
		for (int i = 0; i<3; i++) {
			for (int j =0; j< 4; j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println(" ");
		}
		System.out.println();

	}

}
