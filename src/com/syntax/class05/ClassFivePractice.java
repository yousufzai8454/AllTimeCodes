package com.syntax.class05;

import java.util.Scanner;

public class ClassFivePractice {

	public static void main(String[] args) {
		/*
		 * let's ask user what is today day
		 *
		 *based on the day lets define which class we have. 
		 *
		 * if (Monday or Friday) --> there is no class today. 
		 * else if (Tuesday or Wednesday) --> Manual 
		 * else if (Thursday) --> Review class
		 * else if (Saturday or Sunday) --> Java class 
		 * 
		 */
		
		Scanner day = new Scanner(System.in);
		System.out.println("Please enter a day.");
		
		String  my= day.nextLine();
		
		
			
		if (my.equalsIgnoreCase("Monday") || my.equalsIgnoreCase("Friday")) {
			System.out.println("There is no class");
			
		}else if (my.equalsIgnoreCase("Tuesday") || my.equalsIgnoreCase("Wednesday")) {
			System.out.println("I have a Manual Testing calss");
			
		}else if (my.equalsIgnoreCase("Saturday") || my.equalsIgnoreCase("Sunday")) {
			System.out.println("I have Java class");
		}

	}

}
