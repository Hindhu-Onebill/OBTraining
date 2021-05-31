package com.onebill.corejava.Day10Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student7 {
    int id;
    String sname;
    int age;
    int marks;
    
	public Student7(int id, String sname, int age, int marks) {
		super();
		this.id = id;
		this.sname = sname;
		this.age = age;
		this.marks = marks;
	}
	
	public int getSid() {
		return id;
	}
	public void setSid(int sid) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student7 [sid=" + id + ", sname=" + sname + ", age=" + age + ", marks=" + marks + "]";
	}
     
}



class SortByName implements Comparator<Student7>{      // sort by name

	@Override
	public int compare(Student7 o1, Student7 o2) {
		return o1.sname.compareTo(o2.sname);
	}
}

class SortById implements Comparator<Student7>{       // sort by id

	@Override
	public int compare(Student7 o1, Student7 o2) {
		return o1.id-o2.id;
	}
}

class SortByAge implements Comparator<Student7>{     // sort by age

	@Override
	public int compare(Student7 o1, Student7 o2) {
		return o1.age - o2.age;
	}
}

class SortByMarks implements Comparator<Student7>{    // sort by marks

	@Override
	public int compare(Student7 o1, Student7 o2) {
		return o1.marks - o2.marks;
	}
	
}


public class StudentSorting {

	public static void main(String[] args) {
		
	 Scanner sc =new Scanner(System.in);
		
     ArrayList<Student7> studentlist =new ArrayList<>();
     studentlist.add(new Student7(7,"Hannah",19,94));
     studentlist.add(new Student7(6,"Clay",19,100));
     studentlist.add(new Student7(8,"Justin",20,90));
     studentlist.add(new Student7(3,"Zach",17,70));
     studentlist.add(new Student7(2,"Alex",21,90));
     studentlist.add(new Student7(9,"Tony",20,34));
     studentlist.add(new Student7(1,"Jessica",19,60));
     studentlist.add(new Student7(4,"Taylor",19,85));
    
     System.out.println("Sort By: \n1.Name\n2.Id\n3.Age\n4.Marks");
     System.out.print("Enter your Choice:");
     int choice =sc.nextInt();
     
     switch(choice){
     
     case 1:
    	 System.out.println("\nSorting by Name:\n");
    	 Collections.sort(studentlist,new SortByName());
         break;
     case 2:
    	 System.out.println("\nSorting by Id:\n");
    	 Collections.sort(studentlist,new SortById());
    	 break;
     case 3:
    	 System.out.println("\nSorting by Age:\n");
    	 Collections.sort(studentlist,new SortByAge());
    	 break;
     case 4:
    	 System.out.println("\nSorting by Marks:\n");
    	 Collections.sort(studentlist,new SortByMarks());
    	 break;
     default:
    	 System.out.println("\nWrong Choice!");
    	 System.exit(0);
     }
     
     for(Student7 stu :studentlist) {
    	 System.out.println(stu.getSid()+" "+stu.getSname()+"  "+stu.getAge()+" "+stu.getMarks());
     }
     sc.close();
  }

}