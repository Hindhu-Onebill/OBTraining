/*Created two threads and tried to access same resource(Printer)
 * But since it has synchronized method only after execution of 1 thread next is executed*/


package com.onebill.corejava.Day8Handson;

class Printer{
	synchronized void printDocument(int numberOfCopies , String DocumentName) {
		for(int i =0; i<= numberOfCopies; i++)
			System.out.println(">>>.Printing.<<<" +DocumentName+ " "+i );
	}
}

class Person1 extends Thread{
	Printer printerRef;    //variable of type Printer
	public Person1(Printer p) {  //Constructor with parameter of type Printer
		printerRef = p;
	}
	public void run() {
		printerRef.printDocument(10, "Person1.pdf");  //calling the Printer class with its ref variable
	}
}

class Person2 extends Thread{
	Printer printerRef;   //variable of type Printer
	public Person2(Printer p) {  //Constructor with parameter of type Printer
		printerRef = p;
	}
	public void run() {
		printerRef.printDocument(10, "Person2.pdf");   //calling the Printer class with its ref variable
	}
}

public class PrinterProblem {

	public static void main(String[] args) {
		System.out.println("Printer started..");
		Printer printer = new Printer();
		
		Person1 thread1 = new Person1(printer); //passing arguments to constructor
		Person2 thread2 = new Person2(printer);
		
		thread1.start();
		thread2.start();
	}

}
