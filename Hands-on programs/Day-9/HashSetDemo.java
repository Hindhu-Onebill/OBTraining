package com.onebill.corejava.Day9Handson;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(500);
		hs.add(100);
		hs.add(200);
		hs.add(null);
		System.out.println(hs);
		System.out.println("size :"+hs.size());
		
		Iterator<Integer> iterator = hs.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
	}

}
