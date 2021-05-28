//ArrayList program sorting elements using comparable

package com.onebill.corejava.Day9Handson;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{

	int id;
	String pname;
	
	public Person(int id, String pname) {
		super();
		this.id = id;
		this.pname = pname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public int compareTo(Person o) {
		return this.id - o.id;
		//return 0;
	}
	
	public int hashCode() {
		return this.id;
	}
	
}

public class ArrayListComparable {

	public static void main(String[] args) {
		ArrayList<Person> parrayList = new ArrayList<Person>();
		parrayList.add(new Person(10, "Hindhu"));
		parrayList.add(new Person(5, "Gokul"));
		parrayList.add(new Person(20, "Aishu"));
		
		Collections.sort(parrayList);
		for(Person p :parrayList) {
			System.out.println(p.getId()+ " "+p.getPname() );
		}
	}

}
