/*We cannot change the string unless it is being reassigned*/

package com.onebill.corejava.d6handson;

public class StringImmutable {

	public static void main(String[] args) {
		String[] sample = {"This","is","a","test"};
		System.out.println("Original array");
		for(String s:sample)
			System.out.print(s+ " ");
		System.out.println(" ");
		
		sample[1] = "was";
		sample[3] = sample[3].concat(", too");
		for(String s:sample)
			System.out.print(s+ " ");
	}

}
