/*a >> 1 : all the bits gets right shifted once
 * a >> b : all the bits gets right shifted b times*/

package com.onebill.corejava.basics;

public class ShiftOperators {

	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		int c = 3;
		
		int right = a >> b;
		System.out.println("Bits of 'a' shifted to right 'b' times, answer is "+right);
        int left = c << b;
        System.out.println("Bits of 'c' shifted to left 'b' times, answer is "+left);
	}

}
