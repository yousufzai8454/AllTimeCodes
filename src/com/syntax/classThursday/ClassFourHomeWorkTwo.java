package com.syntax.classThursday;

import java.util.Scanner;

public class ClassFourHomeWorkTwo {

	public static void main(String[] args) {
		// Home work 2. 
		Scanner inp=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=inp.nextInt();
		if (age>=18) {
			System.out.println("You will be issued a driver license");
		}else {
			System.out.println("Pelase get a learner's permit");
			
		}

	}

}
