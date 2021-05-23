//two objects referring each other but no other representing them is called island of isolation
// those objects are eligible for garbage collection

package com.onebill.corejava.basics;

public class IslandOfIsolation {
	
	IslandOfIsolation i;
	public static void main(String[] args) {
		IslandOfIsolation obj1 = new IslandOfIsolation();
		IslandOfIsolation obj2 = new IslandOfIsolation();
		
		obj1.i = obj2;
		obj2.i = obj1;
		
		obj1 = null;
		obj2 = null;
		
		System.gc();
	}
	protected void finalize() throws Throwable{ 
		System.out.println("Finalise method called");
	}

}
