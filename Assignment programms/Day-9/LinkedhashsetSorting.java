//Sorting of LinkedHashSet primitive data type

package com.onebill.corejava.Day9Assignment;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedhashsetSorting {

	public static void main(String[] args) {
		LinkedHashSet<Integer> Numbers = new LinkedHashSet<Integer>();

		Numbers.add(26);
		Numbers.add(23);
		Numbers.add(24);
		Numbers.add(21);
		Numbers.add(25);
		Numbers.add(22);

		/*
		 * To sort LinkedHashSet, convert it to a TreeSet using the constructor
		 */
		TreeSet<Integer> tSet = new TreeSet<Integer>(Numbers);

		System.out.println("TreeSet contains: " + tSet);

	}

}
