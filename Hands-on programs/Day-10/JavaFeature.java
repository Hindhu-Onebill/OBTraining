package com.onebill.corejava.Day10Handson;

interface MyInterface2{
	void abstractmethod();
	
	default void normalmethod() {
		System.out.println("from normal method");
	}
	
	static void staticmethod() {
		System.out.println("static");
	}
}


public class JavaFeature {

	public static void main(String[] args) {
		MyInterface2 ref = () -> {System.out.println("Inside show method..");};
		ref.abstractmethod();
		ref.normalmethod();
		MyInterface2.staticmethod();

	}

}
