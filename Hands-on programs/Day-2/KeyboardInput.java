/*Taking input from user using System.in*/

package com.onebill.corejava.basics;
import java.io.IOException;

public class KeyboardInput {

	public static void main(String[] args) {
		char favchar;
		System.out.println("Enter your favourite letter");
		try {
			favchar = (char) System.in.read();
			System.out.println("You entered "+favchar);
			} catch (IOException e) {
			e.printStackTrace();
			}
	}

}

