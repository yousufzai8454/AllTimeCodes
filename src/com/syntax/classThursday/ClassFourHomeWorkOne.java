package com.syntax.classThursday;

import java.util.Scanner;

public class ClassFourHomeWorkOne {

	public static void main(String[] args) {
		// Home work 1. 
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the amont of loan you need?");
		int loan =scan.nextInt();
		if(loan<=200000) {
			System.out.println("You are eligible for loan");
		}else {
			System.out.println("Sorry you are not elilible");
		}
		
		
	}

}
