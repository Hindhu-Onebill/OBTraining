/*more than 1 variable can be initialized and incremented/decremented
 * but must have only one condition*/

package com.onebill.corejava.basics;

public class Multipleloops {

	public static void main(String[] args) {
		int i,j;
		for(i=0,j=10;i<j;i++,j--)
			System.out.println(" i and j are " + i + " "+j);

	}

}
