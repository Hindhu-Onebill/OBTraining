//Introduction to Collections--> ArrayList,various methods to iterate through it

package com.onebill.corejava.Day8Handson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		
		System.out.println("---Auto display----");
		System.out.println(arrayList);
		
		System.out.println("------For loop----");
		for(int i=0; i <arrayList.size();i++) {
			System.out.println(i);
		}
		
		System.out.println("---for-each loop---");
		for(Integer i:arrayList) {
			System.out.println(i);
		}
		
		System.out.println("----Iterator---");
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("---List Iterator(forward---");
		ListIterator<Integer> listIterator = arrayList.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("----List iterator(backward)---- ");
		ListIterator<Integer> listIterator1 = arrayList.listIterator(arrayList.size());
		while(listIterator1.hasPrevious()) {
			System.out.println(listIterator1.previous());
		}
	}

}
