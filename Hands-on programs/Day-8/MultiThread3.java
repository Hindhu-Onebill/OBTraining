//Started 2 threads one in main class another in different class
//Both get executed simultaneously and prints the result

package com.onebill.corejava.Day8Handson;

class MyThread implements Runnable{
	String threadname;
	public MyThread(String tname) {
		threadname = tname;
	}
	
	@Override
	public void run() {
		for(int count =0; count <= 5; count++) {
			try {
				Thread.sleep(500);
				System.out.println("In " + threadname+ " count is " +count);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}

public class MultiThread3 {

	public static void main(String[] args) {
		System.out.println("Main thread");
		MyThread mt = new MyThread("Child thread");
		
		Thread newThread = new Thread(mt);
		
		newThread.start();
		
		for(int i = 0; i<10 ; i++) {
			try {
				Thread.sleep(500);
				System.out.println("In main " +i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
