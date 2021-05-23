/*Short circuit AND and short circuit OR are the operators that is considered 
 * when first value itself is false and true respectively */

package com.onebill.corejava.basics;

public class ShortCircuit {

	public static void main(String[] args) {
		if(false && true && true)
			System.out.println("This will not be printed");
		else 
			System.out.println("Due to short circuit and this willl be printed");
		
		if(true || false || true)
			System.out.println("This will be printed");
		else 
			System.out.println("Nah");
	}

}
