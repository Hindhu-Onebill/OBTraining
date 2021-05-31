package com.onebill.corejava.Day10Handson;

import java.util.List;
import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		
		System.out.println("--foreach1--");
		for(Integer x: values)System.out.println(x);
		
		System.out.println("--foreach2--");
		values.forEach(i -> System.out.println(i));
		
		System.out.println("--foreach3--");
		values.forEach(System.out::println);
		
		System.out.println("--stream method--");
		values.stream().forEach(System.out::println);
		
		System.out.println("--parallel stream--");
		values.parallelStream().forEach(System.out::println);

	}

}
