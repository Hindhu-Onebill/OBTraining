/*Class inside another class*/

package com.onebill.corejava.nestedclasses;

class Outer{
	class Inner{
		public void show()
		{
			System.out.println("inner class");
		}
	}
}

public class OuterInnerDemo {

	public static void main(String[] args) {
		//Outer.Inner inner = new Outer().new Inner();
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.show();
	}

}
