/*Type casting
 * double->float->long->int->short->Byte*/

package com.onebill.corejava.basics;

public class TypeCasting {

	public static void main(String[] args) {
		double value1 = 7.5;
		int value2 = (int) value1;
		float value3 = (float) value1;
		
		
		System.out.println("Double Value is "+value1);
		System.out.println("Integer value after type casting is "+value2);
		System.out.println("Floating value after type casting is "+value3);
	}

}
