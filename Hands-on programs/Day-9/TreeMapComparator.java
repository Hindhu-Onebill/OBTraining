//TreeMap implementation

package com.onebill.corejava.Day9Handson;

import java.util.Map;
import java.util.Set;
import java.security.KeyStore.Entry;
import java.util.Comparator;
import java.util.TreeMap;

class Employee{
	
	int empid;
	String empname;
	
	public Employee(int empid, String empnam) {
		super();
		this.empid = empid;
		this.empname = empnam;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}


}

class SortById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.empid - o2.empid;
	}
	
}

public class TreeMapComparator {

	public static void main(String[] args) {
		TreeMap<Employee, Integer> tm = new TreeMap<Employee, Integer>(new SortById());
		tm.put(new Employee(1, "Harry"),1);
		tm.put(new Employee(2, "Louis"),5);
		tm.put(new Employee(3, "Niall"),3);
		
		Set<Map.Entry<Employee,Integer>> m1 = tm.entrySet();
		for(java.util.Map.Entry<Employee, Integer> itrvar :m1) {
			System.out.println(itrvar);
		}

	}

}
