/*Two inner classes inside the outer class*/

package com.onebill.corejava.nestedclasses;

class CPU{
	class RAM{
		int storage = 32;
		void display() {
			System.out.println("Storage is "+storage);
		}
	}
	
	class Processor{
		int speed = 1000;
		void show() {
			System.out.println("Speed is " +speed);
		}
	}
	void display() {
		System.out.println("Printed the inner class");
	}
}

public class CPUMain {

	public static void main(String[] args) {
		
		CPU obj = new CPU();
		CPU.RAM obj1 = obj.new RAM();
		CPU.Processor obj2 = obj.new Processor();
		
		obj1.display();
		obj2.show();
		obj.display();
		

	}

}
