package com.onebill.corejava.Day9Assignment;

import java.util.Collections;
import java.util.Vector;

public class VectorSort {

	public static void main(String[] args) {
		
		Vector<String> vec = new Vector<String>();
		
		// Add elements in the vector
		vec.add("White");
		vec.add("Green");
		vec.add("Black");
		vec.add("Orange");
		System.out.println("The vector elements are: ");
		
		// Display the vector elements
		for (String colors : vec) {
			System.out.println("  " + colors);
		}
		
		// Sorting the vector
		Collections.sort(vec);
		
		// Displaying the vector elements after sort() method
		System.out.println("The vector elements after sort() method are: ");
		for (String colors : vec) {
			System.out.println("  " + colors);
		}
	}

}
