/*Truth table for AND,OR and EXOR*/

package com.onebill.corejava.basics;

public class Truthtable {

	public static void main(String[] args) {
		
		 int [] P = new int [] {1,1,0,0}; 
		 int [] Q = new int [] {1,0,1,0}; 
		 System.out.println("Truth Table");
		 System.out.println(" ");
		 System.out.println("--------------------------");
		 System.out.println("|P | Q | P&Q | P|Q | P^Q |");
		 for(int i = 0; i < 4;i++) {
			 int res1 = P[i] & Q[i];
			 int res2 = P[i] | Q[i];
			 int res3 = P[i] ^ Q[i];
			 System.out.println("|"+P[i]+ " | " +Q[i]+" |  " +res1+ "  |  " +res2+ "  |  " +res3+ "  |");
		 }
		 System.out.println("--------------------------");
	}

}
