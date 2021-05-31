package com.onebill.corejava.Day10Handson;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String str[] = new String[10];
		
		Optional<String> checkForNull = Optional.ofNullable(str[4]);
		if(checkForNull.isPresent()) {
			String newString = str[4].concat("Hello");
			System.out.println(newString);
		}else {
			System.out.println("String value is null at this moment..");
		}

	}

}
