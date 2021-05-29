package com.onebill.corejava.Day9Assignment;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


class Student1 implements Comparable<Student> {
	String name;

	Student1(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class SortByName implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.name.compareTo(o2.name);
	}
	
}


class LinkedHashComparable {

	public static void main(String[] args) {

		// New LinkedHashMap
		LinkedHashMap<Student1, Integer> lh1 = new LinkedHashMap<Student1, Integer>();

		// Adding elements to the map
		lh1.put(new Student1("Bina"), 200);
		lh1.put(new Student1("Akshay"), 400);
		lh1.put(new Student1("Chintu"), 500);
		lh1.put(new Student1("Hindhu"),100);

		// Print Before sort
		System.out.println("Before sort keys in accending order : " + lh1);

		// TreeMap to sort LinkedHashMap using comparable
		TreeMap<Student1, Integer> tree_map = new TreeMap<>(new SortByName());
		tree_map.putAll(lh1);

		Set<Map.Entry<Student1,Integer>> m1 = tree_map.entrySet();
		for(Entry<Student1, Integer> entry : m1){
			System.out.println(entry.getKey()+ "=" +entry.getValue());
			
		}
	}
}
