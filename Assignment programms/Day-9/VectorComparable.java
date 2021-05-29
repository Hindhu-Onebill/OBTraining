//Vector sorting using comparable

package com.onebill.corejava.Day9Assignment;

import java.util.Collections;
import java.util.Vector;
import java.util.*;

// Class implementing comparable interface
class Student implements Comparable<Student> {

	String name;
	int marks;
	int id;

	public Student(String name, int marks, int id) {

		this.name = name;
		this.marks = marks;
		this.id = id;
	}

	
	public int getMarks() {
		return this.marks;
	}

	public int compareTo(Student otherStudent) {

		return this.getMarks() - otherStudent.getMarks();
	}

}

class VectorComparable {

	public static void main(String[] args) {

		Vector<Student> student = new Vector<>();

		student.add(new Student("Roshan", 86, 1));
		student.add(new Student("Ritik", 96, 2));
		student.add(new Student("Ashish", 99, 4));
		student.add(new Student("Sandeep", 100, 9));
		student.add(new Student("Piyush", 88, 34));

		// before calling sort() method
		for (Student s : student)

			// Print and display the sorted vector
			System.out.println("Name:" + s.name + "||" + "Marks:" + s.marks + "||" + "ID:" + s.id);
		
		System.out.println();

		// Calling sort() method of collections
		Collections.sort(student);

		for (Student s : student)

			System.out.println("Name:" + s.name + "||" + "Marks:" + s.marks + "||" + "ID:" + s.id);

	}

}