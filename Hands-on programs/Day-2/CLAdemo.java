/*Command Line Argument: the user can enter the value during execution of the program at the command itself
 *Run-> Run configuration-> Arguments->Program arguments-> enter args-> apply-> run */

package com.onebill.corejava.basics;

public class CLAdemo {

	public static void main(String[] args) {
		System.out.println("The value you entered is "+args[0]);
		System.out.println("My name is "+args[1]);
	}

}
