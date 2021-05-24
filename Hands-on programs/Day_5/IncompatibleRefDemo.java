/*Incompatible reference
 * A parent class's obj can refer to a subclass
 * but a subclass's object can't refer to parent class*/

package com.onebill.corejava.inheritance;

class Main{
	int number1;
	Main(int i) {
		number1 = i;
		System.out.println("Parent is " +number1);
	}
}

class Sub extends Main{
	Sub(int i){
		super(i); // to access from parent
		int number1 = i;
		System.out.println("Child is " +number1);
		
	}
}

public class IncompatibleRefDemo {

	public static void main(String[] args) {
		Sub s1 = new Sub(10);
		//wMain m1 = new Main(5);
		

	}

}
