/*Interface inside another interface is also possible.
 * But while implementing them have to define the methods of both outer and inner class*/

package com.onebill.corejava.interfaces;

interface outer{
	interface inner{
		void insideInner();
	}
	void insideOuter();
}

class Trial implements outer,outer.inner{

	@Override
	public void insideInner() {
		System.out.println("Inner interface");
		
	}

	@Override
	public void insideOuter() {
		System.out.println("Outer interface");
	
	}
	
}

public class InterfaceInsideInterface {

	public static void main(String[] args) {
		outer obj = new Trial();
		outer.inner obj1 = new Trial();
		obj.insideOuter();
		obj1.insideInner();

	}

}
