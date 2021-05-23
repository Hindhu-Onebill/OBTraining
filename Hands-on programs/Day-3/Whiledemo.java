/*finding the the value of (-3 to the power of 3) using while loop*/

package com.onebill.corejava.basics;

public class Whiledemo {

	public static void main(String[] args) {
		int power =3;
		int base = -3;
		int result = 1;
		
		while(power>0)
		{
			result = base * result;
			power--;
		}
		System.out.println("-3 to the power of 3 is "+result);
	}

}


