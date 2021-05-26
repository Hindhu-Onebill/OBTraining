/*Difference between equals() and == in java
 *When we use == operator for s1 and s2 comparison then the result is false as both have different addresses in memory.
 *Using equals, the result is true because its only comparing the values given in s1 and s2. */

package com.onebill.corejava.Day6Assignment;

public class StringEqualsDemo {

	public static void main(String[] args) {
		{
	        String s1 = new String("HELLO");
	        String s2 = new String("HELLO");
	        System.out.println(s1 == s2);
	        System.out.println(s1.equals(s2));
	    }

	}

}
