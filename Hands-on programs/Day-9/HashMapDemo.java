package com.onebill.corejava.Day9Handson;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		h1.put("one", 1);
		h1.put("Two", 2);
		h1.put("Three", 3);
		
		Set<Map.Entry<String,Integer>> m1 = h1.entrySet();
		for(java.util.Map.Entry<String, Integer> entry : m1){
			System.out.println(entry.getKey()+ "=");
			System.out.println(entry.getValue());
		}
		
		Set<String> s1 = h1.keySet();
		for(String string:s1) {
			System.out.println(string);
		}
		
		Collection<Integer> s2 = h1.values();
		for(Integer integer:s2) {
			System.out.println(integer);
		}

	}

}
