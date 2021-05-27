//Thread 1 created and started to run in RunnableMain.java

package com.onebill.corejava.Day8Handson;

public class RunnableClass1 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i = 0; i<5; i++) {
			System.out.println(i);
		}
		
	}
	
}
