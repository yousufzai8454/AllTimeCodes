package com.syntax.class08;

import java.util.Scanner;

public class HomeWorkClass7 {
	
public static void main(String[] args) {
	
	
	/*
	 * 
	 */
	
	Scanner scan = new Scanner(System.in);
	
	for (int i=1; i<=5; i++) {
		

		System.out.println("Please enter your name");
		String name = scan.nextLine();
		
		System.out.println("Please enter your last name");
		String lName=scan.nextLine();
		
		System.out.println("Please enter  your age");
		int age=scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Your name is " + name + " your last name is "  + lName + " and your age is " +age);
		
	}
	
}
	
}
