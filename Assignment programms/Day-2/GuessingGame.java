/*Stored a letter in a variable and asked user to guess the value,
 * repeat until he guesses correctly*/

package com.onebill.corejava.basics;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		String ans = "O";
		int flag=0;
		
		while(flag==0) {
		System.out.println("Guess the Letter");
		Scanner scan = new Scanner(System.in);
		String choice=scan.nextLine();
			
				if(choice.equals(ans))
				{
					System.out.println("Your answer is correct!You Won!");
					flag = 1;
				}
				else {
					System.out.println("Wrong answer,try again");
					continue;
				}
			}
			
	}

}
