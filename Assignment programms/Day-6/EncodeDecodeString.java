/*Encode and decode alphabets to numbers and vice versa*/

package com.onebill.corejava.Day6Assignment;

import java.util.Scanner;

public class EncodeDecodeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println("Encode");
		for (int i = 0; i < s.length(); ++i) {
			  if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
			    System.out.print((int)s.charAt(i) - (int)'a'+ " ");
			  } 
			  else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				  System.out.print((int)s.charAt(i) - (int)'A'+ " ");
			  else if(s.charAt(i) == ' ')
				  System.out.print("99 ");
			}
		
		System.out.println(" ");
		System.out.println();
		System.out.println("Decode");
		int[] array = new int[5];
		int n= 5;
		
		System.out.println("Enter 5 numbers to decode");
		
		for(int i =0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		for(int i=0;i<n ; i++) {
			if(array[i]>0 && array[i]<25)
				System.out.print((char)('A' + array[i]));
			else 
				System.out.print(" ");
		}
		}
	}


