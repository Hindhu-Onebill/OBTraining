/*Bitwise shifting (short hand writing)*/

package com.onebill.corejava.basics;

public class BitwiseSH {
	public static void main(String args[]) {
		int first = 1;
		int second = 2;
		int third = 3;
		
		first |= 4; // first = first = first | 4 --> (first or 4)
		second >>= 1; // second = second >> 1 -->  (one time shift all the bits to right)
		third <<= 1; // third = third << 1 -->  (one time shift all the bits to left)
		
		//first ^= third; [^ is exor operator]
		
		System.out.println("First is "+first);
		System.out.println("second is "+second);
		System.out.println("third is "+third);
	}

}
