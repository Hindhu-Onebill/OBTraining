//Created a thread by implementing runnable

package com.onebill.corejava.Day8Handson;

class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread running...");	
	}	
}

public class CreateThread2 {

	public static void main(String[] args) {
		ThreadDemo obj = new ThreadDemo();
		Thread tobj = new Thread(obj);
		
		tobj.start();

	}

}
