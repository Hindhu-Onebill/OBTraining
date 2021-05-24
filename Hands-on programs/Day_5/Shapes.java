/*Single inheritance*/

package com.onebill.corejava.inheritance;

class TwoDShape{
	double width;
	double height;
	void showDimension() {
		System.out.println("Width and height are "+ width+ "and" +height );
	}
}

class Triangle extends TwoDShape{
	String style;
	void showStyle() {
		System.out.println("Triangle is "+style);
	}
	double calculateArea() {
		double ans = width * height / 2;
		System.out.println("answer is "+ans);
		return 0;
	}
}

public class Shapes {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.width = 3;
		t1.height = 2;
		t1.style = "With border";

		t2.width = 4;
		t2.height = 5;
		t2.style = "Without border";
		
		System.out.println("t1 details");
		t1.showDimension();
		t1.showStyle();
		t1.calculateArea();
		System.out.println(" ");
		
		System.out.println("t2 details");
		t2.showDimension();
		t2.showStyle();
		t2.calculateArea();

	}

}
