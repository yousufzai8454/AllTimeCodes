package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExmple {

	public static void main(String[] args) {
		/*
		 *  Do Loop with scanner
		 *  Create a secret number. 
		 *  We want user to guess our secret number. 
		 *  the moment the user guessed my secret number -->my program should stop 
		 *  otherwise it should continue asking to guess my number. 
		 */
	
		int secretNummber=12;
		Scanner scan = new Scanner(System.in);
		int guessNumber;
		
		do {
			System.out.println("Please enter a number to win");
			guessNumber=scan.nextInt();
			
		}while(guessNumber!=secretNummber);
		
		System.out.println("Congratulation you won");
		

	}

}
