package com.onebill.corejava.Day9Handson;

import java.util.ArrayList;

public class ArrayString {

	public static void main(String[] args) {
		ArrayList<String> arrayString = new ArrayList<String>();
		arrayString.add("Hi");
		arrayString.add("Welcome");
		arrayString.add("Everyone");
		
		String[] stringArray = new String[arrayString.size()];
		for (int i =0; i<arrayString.size();i++) {
			stringArray[i] = arrayString.get(i);
		}
		
		for(int i = 0; i <stringArray.length;i++)
		{
			System.out.println(stringArray[i]);
		}

	}

}
