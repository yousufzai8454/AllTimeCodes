package com.syntax.class07;

public class ForLoop1 {

	public static void main(String[] args) {
		/*
		 * for loop
		 * initialization 
		 * condition
		 * increment or decrement. 
		 * 
		 */
		
		for (int i=1; i<=5; i++) {
			System.out.println("Hello");
			
		}
		System.out.println(" I want to print nubmers from 1-20");
		
		/*
		 * Start point 
		 * End point 
		 */
		
		for (int i=1; i<=20; i++) {
			System.out.print(i+ " ");
		}
		System.out.println(" I want to print number from 10 to 25");
		
		for (int i=10; i<=25; i++) {
			System.out.print(i+" ");
		}
		System.out.println("I want to print number from 50 to 1");
		
		for (int i=50; i>=1; i--) {
			System.out.print(i+" ");
		}
	}

}
