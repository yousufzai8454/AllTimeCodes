package com.syntax.classThursday;

import java.util.Scanner;

public class ClassFourHomeWorkFour {

	public static void main(String[] args) {
		// Home work 4. 
		Scanner inp=new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		boolean credit=inp.nextBoolean();
		if (credit==false) {
			System.out.println("We offer you to get a credit card");
		}else {
			System.out.println("What is the balance on your card");
			int balance=inp.nextInt();
			if(balance>1000) {
				System.out.println("You should pay it off ASAP");
			}else {
				System.out.println("You can spend more");
			}
		}

	}

}
