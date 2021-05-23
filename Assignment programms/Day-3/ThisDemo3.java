/*Constructor overloading- passing arguments by taking input from user*/

package com.onebill.corejava.basics;

import java.util.Scanner;

class Box{
	int height;
	int width;
	int length;
	
	public Box(){
		this.height = 1;
		this.width = 1;
		this.length = 4;
	}
	
	public Box(int height,int width){
		this.height = height;
		this.width = width;
		this.length = 4;
	}
	
	public Box(int height,int width,int length){
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public int Volume() {
		int result;
		result = height * width * length;
		System.out.println("Volume is "+result);
		return result;
	}
	
}

public class ThisDemo3 {

	public static void main(String[] args) {
		System.out.println("Enter the height,length,width");
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		int width = scan.nextInt();
		int length = scan.nextInt();
		
		Box B1 = new Box(height,width,length);
		B1.Volume();
		Box B2 = new Box(height,width);
		B2.Volume();
		Box B3 = new Box();
		B3.Volume();

	}

}
