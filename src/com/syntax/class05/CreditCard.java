package com.syntax.class05;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you have a credit card? Yes /No");
		
		String creditCard=scan.next();
		
		if(creditCard.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on your credit card?");
			
			double balance = scan.nextDouble();
			if(balance>1000) {
				System.out.println("Pay it off ASAP");
			}else {
				System.out.println("You can spend more money");
			}
		}else {
			System.out.println("We can offer you a credit card with no interset for 5 years. ");
		}
	}

}
