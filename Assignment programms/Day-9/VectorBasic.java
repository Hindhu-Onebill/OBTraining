//Vector creation and basic methods in it

package com.onebill.corejava.Day9Assignment;

import java.util.Vector;

public class VectorBasic {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		vec.add("Data Structures");
		vec.add("OOPS");
		vec.add("DataBase");
		
		System.out.println("--print elements--");
		System.out.println(vec);
		
		System.out.println("--size and capacity--");
		System.out.println(vec.size());
		System.out.println(vec.capacity()); //gives default capacity 10
		
		System.out.println("--adding more elements--");
		vec.add("Operating System");
		vec.add(4, "Networks");
		System.out.println(vec);
		
		System.out.println("--change elements using set method--");
		vec.set(2, "Algorithms");
		System.out.println(vec);
		
		System.out.println("--to return element--");
		System.out.println(vec.elementAt(3));
		
		System.out.println("--returns first element--");
		System.out.println(vec.firstElement());
		
		System.out.println("--remove element at particular index--");
		vec.remove(3);
		System.out.println(vec);
		
		System.out.println("--clear all elements--");
		vec.clear();
		System.out.println(vec);
	}

}
