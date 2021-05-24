/*Static method demo
 * It can access only static member of the particular class*/

package com.onebill.corejava.interfaces;

class Employee1{
	int empid;
	String empName;
	static String companyName = "Onebill";
	
	static void changeName() {
		companyName ="Testyantra";
		//non static members can't be accessed
	}
	
	public Employee1(int empid,String empName) {
		//super();
		this.empid = empid;
		this.empName = empName;
	}
	
	void display()
	{
		System.out.println(empid+ " "+empName+ " "+companyName);
	}
}

public class StaticMethodDemo {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1(111,"Rahul");
		Employee1 emp2 = new Employee1(311,"Kurnal");
		Employee1.changeName();
		emp1.display();
		emp2.display();
	}

}
