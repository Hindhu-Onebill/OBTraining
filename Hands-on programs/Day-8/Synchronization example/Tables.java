//connected with SyncTables.java
//If we want we can synchronize the method also.

package com.onebill.corejava.Day8Handson;

public class Tables extends Thread  {

	public void printTable(int number) {  //synchronized to synchronize method
		for(int i =1; i<=10;i++) 
			System.out.println(i * number);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
