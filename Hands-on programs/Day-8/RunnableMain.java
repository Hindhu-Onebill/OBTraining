//Two threads of different class are called 

package com.onebill.corejava.Day8Handson;

public class RunnableMain {

	public static void main(String[] args) {
		RunnableClass1 one = new RunnableClass1();
		RunnableClass2 two = new RunnableClass2();
		
		//one.run();
		//two.run();
		
		Thread tone = new Thread(one);
		Thread ttwo = new Thread(two);
		
		tone.start();
		ttwo.start();

	}

}
