/*to find if a given string contain the sequence of character*/

package com.onebill.corejava.Day6Assignment;

public class SubSequenceInString {

	public static void main(String[] args) {
		
		String s1 = "Treat people with kindness";
		String s2 = "people";
		
		//System.out.println(s1.subSequence(0, 5)); // gives the subsequence
		//System.out.println(s2.compareTo(s1)); // compare and give +ve or -ve value
		System.out.println(s1.contains(s2)); // Return true if s1 contain s2 or false
		System.out.println(s1.contains("Everyone"));
	}

}
