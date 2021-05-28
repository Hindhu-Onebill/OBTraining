package com.onebill.corejava.Day9Handson;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(500);
		ts.add(200);
		ts.add(700);
		ts.add(400);
		//ts.add(null);
		System.out.println(ts); //gives in ascending order

	}

}
