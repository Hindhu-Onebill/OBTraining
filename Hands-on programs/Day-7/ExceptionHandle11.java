//finally demonstrations

package com.onebill.corejava.Day7Handson;

class FinallyDemo{
	public static void generateException(int what) {
		int[] nums = new int[2];
		try {
			switch(what) {
			case 0:
				int ans = 10/what; //divide by zero error
				break;
			case 1:
				nums[3] =  40;
				break;
			case 2:
				System.out.println("no exception");
				break;
			}
		}catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of run");
		}finally {
			System.out.println("Executed...");
		}
	}
}

public class ExceptionHandle11 {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			FinallyDemo.generateException(i);
		}
	}

}
