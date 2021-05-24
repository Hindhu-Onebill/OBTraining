/*Private inner class inside another class
 * only accessible inside outer class
 * so object of private class is initialized and accessed using a method within outer class*/

package com.onebill.corejava.nestedclasses;

class Outer1{
	private class Inner1{
		void show() {
			System.out.println("private inner class");
		}
	}
	void display() {
		Inner1 obj = new Inner1();
		obj.show();
	}
}

public class PrivateInnerClass {

	public static void main(String[] args) {
		Outer1 obj1 = new Outer1();
		obj1.display();

	}

}
