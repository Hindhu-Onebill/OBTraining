package com.onebill.corejava.Day9Assignment;

import java.util.*;

//Student class implements comparable interface
class Students implements Comparable<Students> {

	Integer marks;

	Students(Integer marks) {
		this.marks = marks;
	}

	public String toString() {
		return (" " + this.marks);
	}

	// Override compareTo method to sort HashSet in
	// accending order
	public int compareTo(Students stu) {
		return this.marks.compareTo(stu.marks);
	}
}

class HashSetComparable{
	public static void main(String[] args) {

		HashSet<Students> set = new HashSet<>();

		set.add(new Students(500));
		set.add(new Students(300));
		set.add(new Students(400));
		set.add(new Students(100));
		set.add(new Students(200));

		System.out.println("Before sort elements in ascending order : " + set);

		// TreeSet to sort HashSet using comparable
		TreeSet<Students> tree_set = new TreeSet<>(set);

		System.out.println("After sort elements in ascending order : " + tree_set);
	}
}