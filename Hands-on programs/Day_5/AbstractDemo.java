/*An abstract class is used when you don't want to create an object
 * You can extend a subclass from it and define it's methods there.
 * It must have atleast one abstract method*/

package com.onebill.corejava.interfaces;

abstract class Shape{
	abstract void draw();
}

class circle extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing a circle");
		
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		Shape s = new circle();
		s.draw();

	}

}
