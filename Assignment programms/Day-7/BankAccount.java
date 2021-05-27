/*Bank account program with custom exception
 * When Amount is negative or Balance is less than 1000 throws exception*/

package com.onebill.corejava.Day7Handson;

import java.util.Scanner;

//custom exception for lesser balance
class CustomException extends Exception{
	public CustomException(String s) {
		super();
	}	
}

//custom exception class for negative amount
class NoNegativeException extends Exception{
	public NoNegativeException(String s) {
		super();
	}	
}

//bank account class
class AccountAction{
	String name;
	int accountNumber;
	int currentBalance;
	int option;
	int x = 0;
	
	Scanner sc = new Scanner(System.in);
	
	//getting details from user
	void getmethod() {
		
		System.out.println("Welcome..Enter your details");
		
		System.out.println("Enter your name");
		name = sc.nextLine();
		
		System.out.println("Enter account number");
		accountNumber = sc.nextInt();
		
		System.out.println("Enter current balance");
		currentBalance = sc.nextInt();
		
		while(x != 1) {
		System.out.println("1.Credit\n2.Debit\n3.My Transactions\n4.Exit");
		System.out.println("Enter your option");
		option = sc.nextInt();
		
		switch(option) {
		case 1:
			try {
				credit();
			} catch (NoNegativeException e1) {
				System.out.println("Negative amount cannot be withdrawn");
			}
			break;
		case 2:
			try {
				debit();
			} catch (CustomException e) {
				System.out.println("Less than minimum balance");
			} catch (NoNegativeException e) {
				System.out.println("Negative amount cannot be withdrawn");
			}
			break;
		case 3:
			display();
			break;
		case 4:
			x = 1;
			System.exit(0);
		default:
			System.out.println("Enter a valid option");
		}
		}
	}
	
	void credit() throws NoNegativeException {
		System.out.println("Enter the amount to credit :");
		int bal1 = sc.nextInt();
		if(bal1 < 0) {
	    	throw new NoNegativeException("Invalid");
	    }else {
		currentBalance = currentBalance + bal1;
		System.out.println("Your updated balance is "+currentBalance);
	    }
	}
	
	 void debit() throws CustomException, NoNegativeException { 
		System.out.println("Enter amount to be withdrawn :");
		    int amount = sc.nextInt();
		    
		    if(amount < 0) {
		    	throw new NoNegativeException("Invalid");
		    }
		    
		if(currentBalance < 1000) {
			throw new CustomException("Invalid");
		}
		else{
		currentBalance = currentBalance - amount;
		System.out.println("Your updated balance is "+currentBalance);
		}
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Account number : "+accountNumber);
		System.out.println("Current balance : "+currentBalance);
	}
}

public class BankAccount {

	public static void main(String[] args) {
		AccountAction obj = new AccountAction();
		obj.getmethod();
	}
}
