//Creating thread using Runnable interface implement

package com.onebill.corejava.Day7Handson;

class MultiThreadingRunnable1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId()+" is running");
		
	}
	
}

public class MultiThreading1 {

	public static void main(String[] args) {
		for(int i =0; i<5; i++) {
			Thread obj = new Thread(new MultiThreadingRunnable1());
			obj.start();
		}

	}

}
