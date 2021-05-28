package com.onebill.corejava.Day9Handson;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		
		System.out.println("--add elements--");
		linkedlist.add(10);
		linkedlist.add(20);
		linkedlist.add(30);
		linkedlist.add(40);
		linkedlist.add(30);
		System.out.println(linkedlist);
		
		System.out.println("--add at particular index--");
		linkedlist.add(0, 5);
		System.out.println(linkedlist);
		
		System.out.println("--remove methods--");
		linkedlist.remove();   //removes from front head element
		System.out.println(linkedlist);
		linkedlist.remove(1);  //removes from particular index
		System.out.println(linkedlist);
		linkedlist.remove(new Integer(30)); //cannot pass 30 it considers index so object should be opbject
		System.out.println(linkedlist);
		
		System.out.println("--set at index--");
		linkedlist.set(1, 20);
		System.out.println(linkedlist);
		
		System.out.println("--adding more elements(gets added at last)--");
		linkedlist.add(30);
		linkedlist.add(40);
		System.out.println(linkedlist);
		
		System.out.println("--adds an element at the first--");
		linkedlist.addFirst(5);
		System.out.println(linkedlist);
		
		System.out.println("--adds an element at the last");
		linkedlist.addLast(100);
		System.out.println(linkedlist);
		
		System.out.println("--new list--");
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(20);
		list2.add(80);
		System.out.println(list2);
		
		System.out.println("--contains all--");
		System.out.println(linkedlist.containsAll(list2));
		
		System.out.println("--indexof(first occurence)--");
		System.out.println(linkedlist.indexOf(new Integer(30)));
		
		System.out.println("--gives the last index of particular elements--");
		System.out.println(linkedlist.lastIndexOf(new Integer(30)));
		
		System.out.println("--get the value at particular index--");
		System.out.println(linkedlist.get(0));
		
		
	}

}
