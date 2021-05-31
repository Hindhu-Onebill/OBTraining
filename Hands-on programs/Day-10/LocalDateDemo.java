package com.onebill.corejava.Day10Handson;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateDemo {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println("current date ...." + localDate);
		
		LocalDate someDate = LocalDate.of(2012, Month.AUGUST, 1);
		System.out.println("date of value ..." + someDate);
		
		LocalDate fromZone = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current date of Asia/ kolkata...." + fromZone);

	}
}