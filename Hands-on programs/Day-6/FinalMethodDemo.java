//When a method is givven as final, child class cannot override it

package com.onebill.corejava.d6handson;

class Parent{
	final void display() {
		System.out.println("From parent class");
	}
}

class Child extends Parent{
	void display1() {             //cannot even have same name
		System.out.println("From child class");
	}
}

public class FinalMethodDemo {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
	}

}
