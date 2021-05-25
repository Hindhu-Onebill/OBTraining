/*Jagged array doesn't have equal number of rows and columns*/

package com.onebill.corejava.d6handson;

import java.util.Arrays;

public class JaggedArray {

	public static void main(String[] args) {
		int array[][] = new int[3][];
		array[0] = new int[]{1,2,3};
		array[1] = new int[]{2,3,5,6};
		array[2] = new int[]{5,7};
		
		for(int[] i:array) {
			System.out.println(Arrays.toString(i));
		}

	}

}
