package com.onebill.corejava.Day10Handson;

interface MyInterface{
	void show();
}

public class LambdaDEmo {

	public static void main(String[] args) {
		//lambda expression
		MyInterface ref = () -> {System.out.println("Inside show method..");};
		//boiler plate code
		ref.show();
	}
}
