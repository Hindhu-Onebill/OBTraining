package com.onebill.corejava.Day9Handson;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(2,30);
		arrayList.add(3, 40);
		
		System.out.println(arrayList);
		
		System.out.println("Set method");
		arrayList.set(2, 70);
		System.out.println(arrayList);
		
		 java.util.List<Integer> sublist = arrayList.subList(1, 3);
		 System.out.println(sublist);
	}

}
