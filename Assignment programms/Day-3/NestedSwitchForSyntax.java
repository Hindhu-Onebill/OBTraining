package com.onebill.corejava.basics;

import java.util.Scanner;

public class NestedSwitchForSyntax {

	public static void main(String[] args) {
		int flag = 0;
		
		while(flag == 0) {
		System.out.println("1.Selection \n2.Iteration \n3.Jump \n4.Exit");
		System.out.println("Select an option\n");
		
		Scanner sc = new Scanner(System.in);
		int option1 = sc.nextInt();
		switch(option1) {
		case 1:
			System.out.println("Selection statements");
			System.out.println("1.if \n2.if-else \n3.nested if \n4.Switch case");
			System.out.println("Enter your option");
			
			int option2 = sc.nextInt();
			switch(option2) {
			case 1:
				System.out.println("Syntax for if condition");
				System.out.println("if(condition){\nstatement\n...\n}");
				break;
			case 2:
				System.out.println("Syntax for if-else condition");
				System.out.println("if(condition){\nstatement\n...\n}\nelse{\nstatement\n...\n}");
				break;
			case 3:
				System.out.println("Syntax for nested if condition");
				System.out.println("if(condition){ \n  if(condition){ \n   statement \n   ... \n  }");
				System.out.println("  else{ \n   statement \n   ... \n  }\n}\nelse{\n  statement\n  ...\n}");
				break;
			case 4:
				System.out.println("Syntax for Switch condition");
				System.out.println("switch(option){ \n  case 1: \n    statement\n    break;");
				System.out.println("  case 1: \n    statement\n    break;");
				System.out.println("  default: \n    statement\n    break;\n}");
				break;
			default:
				System.out.println("Enter a valid option");
				break;
			}
			break;
		case 2:
			System.out.println("Iteration statements");
			System.out.println("1.for loop \n2.while loop \n3.do-while loop");
			System.out.println("Enter your option");
			
			int option3 = sc.nextInt();
			switch(option3) {
			case 1:
				System.out.println("for loop syntax");
				System.out.println("for(init;condition;incr/decr){\n  statement\n}");
				break;
			case 2:
				System.out.println("while loop syntax");
				System.out.println("while(condition){\n  statements\n}");
				break;
			case 3:
				System.out.println("do-while loop syntax");
				System.out.println("do{\n  Statement\n}while(condition);");
				break;
			default:
				System.out.println("Enter a valid option");
				break;
			}
			break;
		case 3:
			System.out.println("Jump statements");
			System.out.println("1.break \n2.continue \n3.return");
			System.out.println("Enter your option");
			
			int option4 = sc.nextInt();
			switch(option4) {
			case 1:
				System.out.println("break statement");
				System.out.println("if(condition){\n  break;\n}");
				break;
			case 2:
				System.out.println("continue statement");
				System.out.println("if(condition){\n  continue;\n}");
				break;
			case 3:
				System.out.println("return statement");
				System.out.println("returnp-type function-name(){\n  code to be executed\n  return;\n}");
				break;
			}
			break;
		case 4:
			System.out.println("Thank you!");
			return;
		default:
			System.out.println("Enter a valid option");
			break;
		}
		sc.close();
	}
	}

}
