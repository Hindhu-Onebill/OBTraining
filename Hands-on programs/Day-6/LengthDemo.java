/*Usage of length in arrays
 * with integer it acts as member variable
 * with string it acts as method*/

package com.onebill.corejava.d6handson;

public class LengthDemo {

	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int[] arr2 = {1,2,3};
		int[][] arr3 = {
				{1,2,3},
				{1,2}	
				};
		System.out.println("Length of arr1 is "+arr1.length);
		System.out.println("Length of arr2 is "+arr2.length);
		System.out.println("Length of arr3 row 1 is "+arr3[0].length);
		System.out.println("Length of arr3 row 2 is "+arr3[1].length);
		}
	}
