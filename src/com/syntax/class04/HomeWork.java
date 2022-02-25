package com.syntax.class04;

public class HomeWork {

	public static void main(String[] args) {
		/*
		 * Write a program to check weather number is positive or negative 
		 */
		
		int num =-72364;
		
		if(num <0) {
			System.out.println("The nummber " + num + " is Negative");
		}else {
			System.out.println("The number " + num + " is Postive");
		}
		
		
		int num1 =0;
		
		if(num1 <0) {
			System.out.println("The nummber " + num1 + " is Negative");
		}else if(num1>0){
			System.out.println("The number " + num1 + " is Postive");
		}else {
			System.out.println("The number is "+num1);
		}
		
		/*
		 * Write a Java Program to check whether number is even or odd. 
		 */
		num = 10;
		if (num % 2 ==0) {
			System.out.println("This "+ num + " is an even Number");
		}else {
			System.out.println("The " + " Is a n Odd Number");
			
		}
	}
	

}
