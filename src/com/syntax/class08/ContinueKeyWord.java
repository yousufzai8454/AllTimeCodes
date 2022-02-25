package com.syntax.class08;

import java.util.Scanner;

public class ContinueKeyWord {

	public static void main(String[] args) {
		// Continue Key word.
		
		for (int i=1; i<=7; i++) {
			
				if (i==3) {
					continue; //skip current iteration/cycle. Meaning that it will skip #3. 
					
				}
				System.out.println("Hello"+i);
				System.out.println("We are Batch 12");
			
		}
		
		/*
		 * I want to print all the numbers from 1-1- except number 4. 
		 */
		
		for (int i=1; i<=10; i++) {
			
			if (i==4 || i==7) {
				continue;
				
			}
			System.out.print(i+" ");
			
		}
		
		/*
		 * Print numbers from 1 to 50 except those that are divisible by 3
Create a program that will keep asking user to apply for a credit card. As soon you get 
“yes” from a user program should stop asking.
		 */
				
		for (int i=1; i<=50; i++) {
			
			if(i %3==0) {
				continue;
				
			}
			System.out.print(i+ " ");
		}
		
		Scanner sc = new Scanner(System.in);
		String answer;
		
		do {
			System.out.println("Do you want to apply for cridet card?");
			answer =sc.nextLine();
		}while (!answer.equalsIgnoreCase("yes"));
		
		System.out.println("Congrats! here your card");
		
	}

}
