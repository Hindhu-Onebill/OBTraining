//Created a thread using extend

package com.onebill.corejava.Day8Handson;

class Thread1 extends Thread{

	public void run() {
		System.out.println("Thread started");
	}	
}

public class CreateThread1 {

	public static void main(String[] args) {
		Thread1 obj = new Thread1();
		obj.start();

	}

}
