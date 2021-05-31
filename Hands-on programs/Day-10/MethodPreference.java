package com.onebill.corejava.Day10Handson;

interface MyInterfaceA{
	default void show() {
		System.out.println("Interface A");
	}
}

interface MyInterfaceB{
	default void show() {
		System.out.println("Interface B");
	}
}

class B {
	void show() {
		System.out.println("class B");
	}
}

public class MethodPreference extends B implements MyInterfaceA , MyInterfaceB {

	public static void main(String[] args) {
		MethodPreference obj = new MethodPreference();
		obj.show();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
	}

}
