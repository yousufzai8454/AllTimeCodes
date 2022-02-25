package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkTwoClass6 {
public static void main(String[] args) {
	/*
	 * Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output 
		“It is a weekday”, anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
	 * 
	 */
	
	Scanner day = new Scanner(System.in);
	System.out.println("Please enter nuerical value of today's day.");
	
	int whatDay=day.nextInt();
	
	if (whatDay>=1 && whatDay<=5) {
		System.out.println("It is a weekday.");
		
	}else if(whatDay==7 || whatDay==6) {
		System.out.println("It is weekend.");
	}else {
		System.out.println("Invalid day");
		
	}
}
}
