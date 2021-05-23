package com.onebill.corejava.basics;

class Student{
	int rollno;
	String name;
	float fees;
	public Student(int reg,String Name,float fee) {
		this.rollno = reg;
		this.name = Name;
		this.fees = fee;
	}
	void display() {
		System.out.println(rollno+ " " + name + " " +fees);
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		Student s1 = new Student(111,"Hindhu",5000f);
		s1.display();

	}

}
