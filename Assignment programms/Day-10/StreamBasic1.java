package com.onebill.corejava.Day10Assignment;

import java.util.Arrays;

public class StreamBasic1 {
	public static void main(String[] args)
    {
        int arr_sample1[] = { 11, 2, 3, 42, 5, 6, 17, 8, 9,
                10, 11, 12, 13, 24, 55, 16, 47, 18, 19, 20 };
        System.out.println("These method convert Optional to primitive");
         
        System.out.println("Example of average() : ");
        System.out.println((Arrays.stream(arr_sample1)
                                .average()
                                .getAsDouble()));
  
        System.out.println("Example of findAny() : ");
        System.out.println(Arrays.stream(arr_sample1)
                               .findAny()
                               .getAsInt());
    }
}