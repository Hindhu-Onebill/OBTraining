/*Multiple interfaces extended to single interface*/

package com.onebill.corejava.interfaces;

interface myInterface1{
	void myMethod1();
}

interface myInterface2{
	void myMethod2();
}

interface myInterface3 extends myInterface1,myInterface2 {
	void myMethod3();
}

public class MultipleInterface implements myInterface3 {

	public static void main(String[] args) {
		myInterface3 obj = new MultipleInterface();
		obj.myMethod1();
		obj.myMethod2();
		obj.myMethod3();
	}

	@Override
	public void myMethod1() {
		System.out.println("Mymethod 1");
		
	}

	@Override
	public void myMethod2() {
		System.out.println("Mymethod 2");
		
	}

	@Override
	public void myMethod3() {
		System.out.println("Mymethod 3");
		
	}

}
