/*Array of objects*/

package com.onebill.corejava.d6handson;

class Student{
	int rollno;
	String name;
	Student(int reg, String Name) {
		this.rollno = reg;
		this.name = Name;
		System.out.println("Roll number : "+rollno+ "||Name : "+name);
	}
}

public class ArrayOfObjects {

	public static void main(String[] args) {
		Student Register[] = new Student[2];   //an array of type Student is created
		Register[0] = new Student(301,"Hindhu");
		Register[1] = new Student(303,"Ethi");

	}

}
