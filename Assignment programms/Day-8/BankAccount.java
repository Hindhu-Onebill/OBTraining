//Synchronized the banking methods withdraw and deposit

package com.onebill.corejava.Day8Assignment;

import java.util.Scanner;

class MinBalanceException extends Exception{
	public MinBalanceException(String s) {
		super();
	}	
}

class NoNegativeException extends Exception{
	public NoNegativeException(String s) {
		super();
	}	
}

public class BankAccount {
	public static BankAccount transaction = new BankAccount();
	
	static int balance = 1000;
	
	
	//withdraw class inside another class
	static class Withdraw extends Thread{
		
		Scanner sc = new Scanner(System.in);
		
		public void run() {
			synchronized (transaction) {
				System.out.println("Enter the amount to withdraw :");
				int amount = sc.nextInt();
				int updateBal = balance - amount;
				try {
					if(amount < 0) 
						throw new NoNegativeException("Enter positive number");
					else
					{
						try {
							if(balance < 1000)
								throw new MinBalanceException("Less than minimum balance");
							else 
								System.out.println("Successfully debited! Current Balance :"+updateBal);
						}
						catch(MinBalanceException e) {
							System.out.println("Less than minimum balance");
						}
					}
				}catch(NoNegativeException e) {
					System.out.println("Negative amount cannot be processed");
				}
		}
		 }
		
	}
	
	static class Deposit extends Thread{
		
		Scanner sc = new Scanner(System.in);
		
		
		public void run() {
			 synchronized (transaction) {
					System.out.println("Enter the amount to deposit :");
					int deposit = sc.nextInt();
					try {
						if(deposit < 0)
							throw new NoNegativeException("Amount less than 0");
						else {
							int currentBal = balance + deposit;
							System.out.println("Successfully deposited! Current Balance is :"+currentBal);
						}
					}catch(NoNegativeException e) {
						System.out.println("Negative amount cannot be processed");
					}
				}
		 }
		
	
		
	}
	
	public static void main(String[] args) {
		Deposit deposit = new Deposit();
		Withdraw withdraw = new Withdraw();
		
		//Thread thread1 = new Thread(deposit);
		//Thread thread2 = new Thread(withdraw);
		
		deposit.start();
		withdraw.start();
		
		
	}

}