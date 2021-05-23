/*JVM clears the heap memory using garbage clean
 * also be done manually using two methods as follow*/

package com.onebill.corejava.basics;

public class GarbageTest {

	public static void main(String[] args) {
		GarbageTest t1 = new GarbageTest();
		GarbageTest t2 = new GarbageTest();
		
		t1 = null;
		System.gc();
		
		t2 = null;
		Runtime.getRuntime().gc();
		

	}
	
	protected void finalize() throws Throwable{ // called by garbage collector when JVM initiates
		System.out.println("Garbage collected");
	}

}
