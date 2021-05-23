package com.onebill.corejava.basics;

import java.util.Scanner;

public class Scannerdemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*private static Scanner sc;
		sc = new Scanner(System.in);*/
		
		System.out.println("Enter employee's name,gender,age,mobile,salary");
		
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		long mobile = sc.nextLong();
		double salary = sc.nextDouble();
		
		System.out.println("Name "+name);
		System.out.println("Gender "+gender);
		System.out.println("Age "+age);
		System.out.println("Mobile number "+mobile);
		System.out.println("salary "+salary);

	}

}
