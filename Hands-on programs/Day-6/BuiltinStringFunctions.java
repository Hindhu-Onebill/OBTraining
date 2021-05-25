/*Various inbuilt string functions*/

package com.onebill.corejava.d6handson;

public class BuiltinStringFunctions {

	public static void main(String[] args) {
		String s1 = "  Java is fun to learn";
		String s2 = " also productive";
		
		System.out.println("Length is -- "+s1.length());
		
		System.out.println("Third character is -- "+s1.charAt(5));
		
		System.out.println("Index of fun is -- "+s1.indexOf("fun"));
		
		System.out.println("Concated string -- "+s1.concat(s2));
		
		boolean check = "Java".equalsIgnoreCase("Java");
		System.out.println(check);
		
		System.out.println("Trim the word -- "+s1.trim());
		
		System.out.println("Substring of s1 is -- "+s1.substring(10));
		
		String s3 = "PYTHON";
		String s4 = "Python";
		
		int checkthis = s3.compareTo(s4);
		System.out.println("Compare to -- "+checkthis);
		
		int checkthis1 = s3.compareToIgnoreCase(s4);
		System.out.println("Compare to ignoring case -- "+checkthis1);
		
		System.out.println("Last index of N in Python is -- "+s4.lastIndexOf('n'));
		
	}

}
