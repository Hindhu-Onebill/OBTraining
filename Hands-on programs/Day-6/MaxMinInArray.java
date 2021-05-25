//Array of primitive datatype

package com.onebill.corejava.d6handson;

public class MaxMinInArray {

	public static void main(String[] args) {
		int[] sample = {77,66,34,26,90};
		int min;
		int max;
		min = max = sample[0];
		
		for(int i =0 ;i <= 4; i++) {
			if(sample[i] < min) min = sample[i];
			if(sample[i] > max) max = sample[i];
		}
		System.out.println("Min and max are "+min+ " " +max);

	}

}
