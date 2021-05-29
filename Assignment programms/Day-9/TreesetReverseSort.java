//treeset sorting in descending order

package com.onebill.corejava.Day9Assignment;

import java.util.TreeSet;

public class TreesetReverseSort {

	public static void main(String[] args) {
		{
	        // Declare a treeset
	        TreeSet<Object> ints = new TreeSet<Object>();
	        ints.add(2);
	        ints.add(20);
	        ints.add(10);
	        ints.add(5);
	        ints.add(7);
	        ints.add(3);
	 
	        // Initialize treeset with predefined set in reverse order using descendingSet()
	        TreeSet<Object> intsReverse = (TreeSet<Object>)ints.descendingSet();
	 
	        // Print the set
	        System.out.println("Without descendingSet(): " +ints);
	        System.out.println("With descendingSet(): " +intsReverse);
	    }

	}

}
