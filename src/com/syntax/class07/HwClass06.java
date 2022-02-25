package com.syntax.class07;

import java.util.Scanner;

public class HwClass06 {

	public static void main(String[] args) {
		// HomeWork class06
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the value for sale");
		String sale =scan.next();
		
		if (sale.equalsIgnoreCase("no")) {
		System.out.println("You are not going to for shoping");
		
	}else if (sale.equalsIgnoreCase("yes")) {
		System.out.println("What is the price of the tiem? ");
	}
}
}
