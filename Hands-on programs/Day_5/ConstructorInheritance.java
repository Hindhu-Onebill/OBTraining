/*Constructor precedence
 * When an object for child class is created, constructor of parent is handled first then 
 * constructor of child is handled*/

package com.onebill.corejava.inheritance;

class Vehicle{
	Vehicle(){
		System.out.println("I bought a vehicle");
	}
}

class Bike extends Vehicle{
	Bike(){
		System.out.println("I bought a bike");
	}
}

public class ConstructorInheritance {

	public static void main(String[] args) {
		Bike object = new Bike();

	}

}
