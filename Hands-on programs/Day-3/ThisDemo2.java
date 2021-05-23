/*Constructor overloading is done with different number of arguments*/

package com.onebill.corejava.basics;

class Person{
	String name;
	String address;
	
	public Person() {
		name = "not known";
		address = "not known";
	}
	public Person(String name) {
		this();
		this.name = name;
	}
	public Person(String name,String address)
	{
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
}

public class ThisDemo2 {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Kumar");
		Person p3 = new Person("Karthi","TN");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		

	}

}
