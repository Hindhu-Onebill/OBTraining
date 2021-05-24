/*Static variable demo
 * It act as a class level variable in this example
 * They can also be changed when it is accessed with then class name*/

package com.onebill.corejava.interfaces;

class Employee{
	int empid;
	String empName;
	static String companyName = "Onebill";
	public Employee(int empid,String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}
	
	void display()
	{
		System.out.println(empid+ " "+empName+ " "+companyName);
	}
}

public class StaticVariableDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(111,"Rahul");
		Employee emp2 = new Employee(311,"Kurnal");
		Employee.companyName = "TestYantra";// static can be changed
		emp1.display();
		emp2.display();
	}

}
