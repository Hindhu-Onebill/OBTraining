package com.onebill.corejava.Day7Handson;

class MultiThreadExtend1 extends Thread{
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId()+" is running");
	}
}

public class MultiThreading2 {

	public static void main(String[] args) {
		
		for(int i =0; i < 5; i++) {
			MultiThreadExtend1 obj = new MultiThreadExtend1();
			obj.start();
		}
	}

}
