package com.onebill.corejava.Day8Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> menu = new ArrayList<String>();
		ArrayList<Integer> price = new ArrayList<Integer>();
		
		menu.add("Zinger Burger");
		menu.add("Chicken Bucket");
		menu.add("Chicken Lollipop");
		menu.add("Chicken popcorn");
		menu.add("Zinger tandoori");	
		menu.add("French fries");
		price.add(180);
		price.add(250);
		price.add(190);
		price.add(160);
		price.add(250);
		price.add(120);
		
		System.out.println("Welcome to KFC! \nToday's Menu");
		int i=1;
		for(String s1:menu) {
			System.out.println(i+ "- "+s1);
			i++;
		}
		
		ArrayList<Integer> orderlist = new ArrayList<Integer>();
		System.out.println("Please enter your order,When finished enter 0");
		int temp=1;
		while(temp!=0) {
			int order = sc.nextInt();
			if(order == 0)
				temp = 0;
			else
				orderlist.add(order-1);
		}
		
		int total=0;
		for(Integer j:orderlist) {
			total+=price.get(j);
		}
		
		System.out.println("Total amount is :"+total);
		System.out.println("Thank you!");
	}
}
		