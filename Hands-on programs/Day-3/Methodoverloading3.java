/*Method overloading by varying the order of parameters*/

package com.onebill.corejava.basics;

class Method{
	
	int a;
	char b;
	
	public void Display(int a,char b) {
		System.out.println("I have 2 parameters: integer then character");
	}
	public void Display(char b,int a) {
		System.out.println("I also have 2 parameters: character then integer");
	}
	
}

public class Methodoverloading3 {

	public static void main(String[] args) {
		Method obj = new Method();
		obj.Display(2,'a');
		obj.Display('h',7);

	}

}
