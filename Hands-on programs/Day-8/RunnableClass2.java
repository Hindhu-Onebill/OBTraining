//Thread 2 created and started to run in RunnableMain.java

package com.onebill.corejava.Day8Handson;

public class RunnableClass2 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i = 0; i <10; i++) {
			System.out.println(i);
		}
		
	}

}
