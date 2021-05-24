/*Interface within an class*/

package com.onebill.corejava.interfaces;

class Test{
	interface myInterface{
		void show();
	}
}

class Test1 implements Test.myInterface{

	@Override
	public void show() {
		System.out.println("Implemented an interface which was inside another class");
		
	}
	
}

public class InterfaceInsideClass {

	public static void main(String[] args) {
		//Test1 obj = new Test1();
		Test.myInterface obj = new Test1();
		obj.show();

	}

}
