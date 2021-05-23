/*Autoboxing : Type casting from primitive to non primitve datatype.
Here integer is converted to string using 3 different methods.*/

package com.onebill.corejava.basics;

public class Autoboxing {

	public static void main(String[] args) {
		int number = 333;

        // converting integer to String using String concatenation
        String s1 = "" + number;
        System.out.println("String value created from int by concatenation : "
                + s1);

        // integer to String conversion using Integer.toString() method
        String s2 = Integer.toString(number);
        System.out.println("Integer to string converted : " + s2);

        // integer value to String using String.valueOf()
        String s3 = String.valueOf(number);
        System.out.println("Newly created string : " + s3);

	}

}
