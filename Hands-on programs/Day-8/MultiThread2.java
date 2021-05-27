package com.onebill.corejava.Day8Handson;

public class MultiThread2 extends Thread{
	
	public void run() {
		for (int i=0; i<6; i++) {
			System.out.println(i);
		try {
			Thread.sleep(500);   //using Thread gives type interrupted Exception so must be handled
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}


	public static void main(String[] args) {
		MultiThread2 obj1 = new MultiThread2(); //Since extended from Thread only obj is enough
		MultiThread2 obj2 = new MultiThread2();
		
		obj1.start();
		//obj1.start();  -- can't initiate twice
		//obj1.run();
		obj2.start();
		//obj2.run();
	}

}
