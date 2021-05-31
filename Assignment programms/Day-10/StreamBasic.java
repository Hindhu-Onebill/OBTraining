package com.onebill.corejava.Day10Assignment;

import java.util.Arrays;

public class StreamBasic {

	public static void main(String[] args) {
		 int arr_sample1[] = { 11, 2, 3, 42, 5, 6, 17, 8, 9, 
	               10, 11, 12, 13, 24, 55, 16, 47, 18, 19, 20 };
	        System.out.println("These method retuns Optional");
	  
	        System.out.println("Example of average() : ");
	        System.out.println((Arrays.stream(arr_sample1).average()));                  
	  
	        System.out.println("Example of findAny() : ");
	        System.out.println(Arrays.stream(arr_sample1).findAny());
	                                 
	        System.out.println("Example of findFirst() :");
	        System.out.println(Arrays.stream(arr_sample1) .findFirst());
	                              
	        System.out.println("Example of max() :");
	        System.out.println(Arrays.stream(arr_sample1).max());                         

	        System.out.println("Example of min() :");
	        System.out.println(Arrays.stream(arr_sample1).min());
	                               
	        System.out.println("Example of reduce() :");
	        System.out.println(Arrays.stream(arr_sample1).reduce((x, y)->x + y));
	                             
	}

}
