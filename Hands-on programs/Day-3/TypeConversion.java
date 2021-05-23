/*Automatic type conversion
 * Byte->short->int->long->float->double*/

package com.onebill.corejava.basics;

public class TypeConversion {

	public static void main(String[] args) {
		int value1 = 10;
		float value2 = value1;
		
		System.out.println("Integer Value is "+value1);
		System.out.println("Floating value after type conversion is "+value2);
	}

}
