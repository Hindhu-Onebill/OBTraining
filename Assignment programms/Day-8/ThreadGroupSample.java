package com.onebill.corejava.Day8Assignment;

public class ThreadGroupSample implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadGroupSample runnable = new ThreadGroupSample();
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

		Thread t1 = new Thread(tg1, runnable, "one");
		t1.start();
		Thread t2 = new Thread(tg1, runnable, "two");
		t2.start();
		Thread t3 = new Thread(tg1, runnable, "three");
		t3.start();

		System.out.println("Thread Group Name: " + tg1.getName());
		tg1.list();

	}
}
