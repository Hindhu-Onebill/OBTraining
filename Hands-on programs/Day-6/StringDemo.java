//different ways of string initialization

package com.onebill.corejava.d6handson;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "java";
		char ch[] = {'S','t','a','r'};
		String s2 = new String(ch);
		String s3 = new String("Print something");
		
		//s1 = "python";
		 s1 = s1.concat(" Training");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//System.out.println(s4);
	}

}
