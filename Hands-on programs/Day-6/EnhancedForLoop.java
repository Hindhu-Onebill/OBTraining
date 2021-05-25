/*enhanced for loop is short for "For loop" 
 * also called for-each*/

package com.onebill.corejava.d6handson;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum =0;
		int sum1 =0;
		for(int i=0; i<5; i++ ) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		
		for(int x:arr) {   //enhanced loop
			sum1 = sum1 + x;
		}
		System.out.println(sum1);
		int avg = sum1 / arr.length;
		System.out.println(avg);
	}

}
