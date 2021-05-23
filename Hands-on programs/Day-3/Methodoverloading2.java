/* Method overloading by varying the type of parameter*/

package com.onebill.corejava.basics;

class Trial{
	
	int a;
	char b;
	
	public void Display(int a){
		System.out.println("I have one parameter but its integer.");
	}
	public void Display(char b){
		System.out.println("Also I have one parameter but its character.");
	}
	
}

public class Methodoverloading2 {

	public static void main(String[] args) {
		Trial obj = new Trial();
		obj.Display(2);
		obj.Display('a');

	}

}
