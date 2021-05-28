//Treeset comparator

package com.onebill.corejava.Day9Handson;


import java.util.Comparator;
import java.util.TreeSet;

class PersonForTreeSet implements Comparator<PersonForTreeSet> {
	int id;
	String pname;

	public PersonForTreeSet(int id, String pname, String pCharacter) {
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
	public String toString() {
		return "PersonForTreeSet [id=" + id + ", pname=" + pname+ "]";
	}

	@Override
	public int compare(PersonForTreeSet o1, PersonForTreeSet o2) {

		return o1.pname.compareTo(o2.pname);
	}
	
}


class SortByPersonName implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.pname.compareTo(o2.pname);
	}
	
}


public class TreeSetDemoComparator {

	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person(10, "Hindhu"));
		ts.add(new Person(15, "Kiran"));
		ts.add(new Person(5, "Aryan"));
		
		for(Person p : ts) {
			System.out.println(p.getPname());
		}
		
	}

}
