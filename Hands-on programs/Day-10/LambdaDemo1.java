package com.onebill.corejava.Day10Handson;

interface MyInterface1{
	void display(int x);
}

public class LambdaDemo1 {

	public static void main(String[] args) {
		MyInterface1 ref = (int x) -> {System.out.println("Print" +x);};
		ref.display(20);

	}

}
