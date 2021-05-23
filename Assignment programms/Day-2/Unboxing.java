/*Unoboxing : Type casting from non-primitive to primitve datatype.*/

package com.onebill.corejava.basics;

public class Unboxing {

	public static void main(String[] args) {
		String item = "2";
        String item2 = "4665749";
        
        // using parse() method
        int value1 = Integer.parseInt(item);
        long value2 = Long.parseLong(item2);
    
        System.out.println("String converted to integer value " +value1);
        System.out.println("String converted to long value " +value2);
        
        //using .valueof() method
        int value4 = Integer.valueOf(item);
        long value3 = Long.valueOf(item2);
        
        System.out.println("String converted to integer value " +value4);
        System.out.println("String converted to long value " +value3);

	}
}
