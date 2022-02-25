package com.syntax.class04;

import java.util.Scanner;

/*
 * to import in mac: cmd+shift+o
 * in windows: ctrl+shift+o
 */
public class TakeInPut {

	public static void main(String[] args) {
		// Create a Scanner and assign to a variable.
		
		//1. create a Scanner and assign to a variable. 
		Scanner scan=new Scanner(System.in);
		 
		//2. specify instructions
		System.out.println("Please enter the country name where you are from");
		
		//3. we have to capture String value --> use next();
		
		String country=scan.next();
		System.out.println("Your are from "+country);
		//if you are from USA --> you speak English 
		// If you are from France --> you speask French 
		
		if(country.equals("USA")) {
			System.out.println("You speak Enlgish");
			}else if (country.equalsIgnoreCase("France")){ //in this case we are ignoring the case. 
			System.out.println("You speak frech");	
			}else if(country.equals("Turkey")) {
				System.out.println("You speak turkish");
			}else {
				System.out.println("I don't know which langauge you speak");
			}
	}

}
