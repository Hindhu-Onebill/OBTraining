/*Interface:
 * Same as abstract class,but many interfaces can be implemented to single interface or class
 * Multiple inheritance is not supported in java so came interfaces
 * Only declare methods within a  interface no declaration.
 * enables customization of methods when implemented into different classes */

package com.onebill.corejava.interfaces;

interface myInterface{
	void myMethod1();
}

public class SimpleInterface implements myInterface {

	public static void main(String[] args) {
		myInterface obj = new SimpleInterface(); //object refering to implemented class
		obj.myMethod1();

	}

	@Override
	public void myMethod1() {
		System.out.println("Interface My method is called");
		
	}

}
