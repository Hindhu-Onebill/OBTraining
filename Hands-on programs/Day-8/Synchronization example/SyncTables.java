//Tables.java and SyncTables.java together
//Synchronized the block so that after one thread only next one executes

package com.onebill.corejava.Day8Handson;

public class SyncTables {

	public static void main(String[] args) {
		Tables table = new Tables();
		
		Runnable ref1 = () ->{    //lambda expression
			synchronized(table){  //synchronized block
			table.printTable(2);
			}
		};
		Runnable ref2 = () ->{
			synchronized(table){   //synchronized block
			table.printTable(5);
			}
		};
		
		Thread one = new Thread(ref1);
		Thread two = new Thread(ref2);
		
		one.start();
		two.start();
	}

}
