/*3 types of variables: Local, Instance, Reference
 * Here reference variable is the object created at main method*/

package com.onebill.corejava.basics;

class Reference{
	int variable1 = 10;
	void display() {
		System.out.println("Value is "+variable1);
	}
}

public class ReferenceDemo {

	public static void main(String[] args) {
		Reference demo = new Reference();
		System.out.println(demo);
		demo.display();

	}

}
