package com.syntax.class05;

import java.util.Scanner;

public class MyselfPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your age");
		
		int yearsOld=input.nextInt();
		
		if (yearsOld>=18) {
			System.out.println("A driver license will be issued to you.");
		}else{
			System.out.println("I am sorry, you will need to get a learner's Permit.");
		}
		
		
		
		
		
		
	}

}
