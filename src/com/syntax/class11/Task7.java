package com.syntax.class11;

public class Task7 {

	public static void main(String[] args) {
		/*
		 * Write a java program to print the first 10 numbers of Fibonacci series. 
		 */
		//Store the number of Fibonacci numbers that we want to produce. 
		//Start from 0 and 1 
		//add the previous numbers to produce the next number. 
		// check if we have printed the required numbers or not. 
		
		int howMany=10;
		int previous=0;
		int current=1;
		int next=0;
		
		char[] pervious;
		System.out.println(previous);
		System.out.println(current);
		
		
		for(int i=0; i<howMany-2; i++) {
			next=previous+current;
			System.out.print(next+" ");
			previous=current;
			current=next;
			
			
		}
		
	}

}
