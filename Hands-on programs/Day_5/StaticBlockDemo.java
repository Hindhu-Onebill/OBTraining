/*static block just contains static members
 * So that the static members can be initialized first*/

package com.onebill.corejava.interfaces;

public class StaticBlockDemo {
	
	//static first invoked to initialized static members
	static {
		System.out.println("static invoked");
	}
	public static void main(String[] args) {
		System.out.println("main invoked");

	}

}
