package com.onebill.corejava.Day7Handson;

public class StringSwitchDemo {
	public static void main(String[] args) {
		String command ="cancel";
	switch(command) {
	case "connect":
		System.out.println("Connecting...");
		break;
	case "cancel":
		System.out.println("Cancelling...");
		break;
	default:
		System.out.println("Error in system");
		break;
	}
	}
}
