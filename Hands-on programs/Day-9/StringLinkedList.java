package com.onebill.corejava.Day9Handson;

import java.util.LinkedList;

public class StringLinkedList {

	public static void main(String[] args) {
		LinkedList<String> programming = new LinkedList<String>();
		programming.add("Java");
		programming.add("Python");
		programming.add("HTML");
		programming.add("C++");
		System.out.println(programming);
		
		System.out.println("--get the value at particular index--");
		System.out.println(programming.get(1));
		
		System.out.println("--set value--");
		programming.set(1, "C"); //have to give separately otherwise won't reflect
		System.out.println(programming);
		
		System.out.println("--adding at first--");
		programming.addFirst("Ruby");
		System.out.println(programming);
		
		System.out.println("--returns first element--");
		System.out.println(programming.getFirst());
		
		System.out.println("--last index value--");
		System.out.println(programming.getLast());

		
	}

}
