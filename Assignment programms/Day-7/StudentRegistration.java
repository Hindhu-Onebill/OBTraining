/*Custom exception for not registering student below age 12 and weight 35kg*/

package com.onebill.corejava.Day7Handson;

import java.util.Scanner;

//custom exception class creation
class CustomException extends Exception{

	public CustomException(String s) {
		super();
	}
	
}
//class student to get details and print
class Students{
	static String name;
	static int age;
	static int weight;
	
	public void getdetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name ");
		name = sc.nextLine();
		
		System.out.println("Enter age ");
		age = sc.nextInt();
		
		System.out.println("Enter weight");
		weight = sc.nextInt();
	}
	
	static void display() throws CustomException{
		if(age < 13 || weight < 35)
		      throw new CustomException("Invalid");  
		 else {
			 System.out.println("Succesfully registered");
			 System.out.println("Name :"+name);
			 System.out.println("Age :"+age);
			 System.out.println("Weight :"+weight);
		}
	}
}

//main class with try catch block
public class StudentRegistration {

	public static void main(String[] args) {
		Students s1 = new Students();
		s1.getdetails();
		try {
			Students.display();
		}catch(CustomException e) {
			System.out.println("Not eligible for registration");
		}

	}

}
