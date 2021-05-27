package com.onebill.corejava.Day7Handson;

import java.io.IOException;

public class ExceptionHandle9 {

	public static char prompt(String str) throws IOException {
		System.out.println(str);
		return (char) System.in.read();
	}
	public static void main(String[] args) {
		char ch;
		try {
			ch = prompt("Enter a letter");
		} catch (IOException e) {
			System.out.println("IO exception occured");
			ch = 'X';
		}
		System.out.println("You entered "+ch);
	}

}
