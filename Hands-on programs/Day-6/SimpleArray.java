//Initialization of an array

package com.onebill.corejava.d6handson;

public class SimpleArray {

	public static void main(String[] args) {
		int[] sample = new int[10];
		int i;
		for(i = 0; i < 10; i++)
			sample[i] = i;
		for(i = 0; i < 10; i++)
			System.out.println("Sample["+i+"]: " +sample[i]);

	}

}
