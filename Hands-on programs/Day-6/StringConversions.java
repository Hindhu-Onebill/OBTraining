/*a string is immutable, so we have string buffer and builder
 string can be converted to buffer or builder even at any point of code*/

package com.onebill.corejava.d6handson;

public class StringConversions {

	public static void main(String[] args) {
		String str = "Onebill";
		
		System.out.println("String to buffer");
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println(sbr);
		System.out.println();
		
		System.out.println("String to builder");
		StringBuilder sbr1 = new StringBuilder(str);
		sbr1.append(" Software");
		System.out.println(sbr1);
		System.out.println();
		
		String sbrString = sbr.toString();
		String sbr1String = sbr1.toString();
		
		System.out.println("Buffer to string");
	    System.out.println(sbrString);
	    System.out.println();
	    
	    System.out.println("Builder to string");
	    System.out.println(sbr1String);
	    System.out.println();
	}

}
