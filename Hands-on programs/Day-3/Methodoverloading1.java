/*Method overloading by varying the number of parameters.*/

package com.onebill.corejava.basics;

class Media{
	
	int a;
	int b;
	int c;
	
	public void Display(int a,int b) {
		System.out.println("I contain only 2 parameter");
	}
	public void Display(int a,int b,int c) {
		System.out.println("I contain 3 parameters");
	}
	
}

public class Methodoverloading1 {

	public static void main(String[] args) {
		Media obj = new Media();
		obj.Display(2,3);
		obj.Display(1,2,3);

	}

}
