package com.syntax.classThursday;

import java.util.Scanner;

public class ClassFourHomeWrokThree {

	public static void main(String[] args) {
		// Home work 3. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Where do you live?");
		String city=sc.next();
		System.out.println("What is the temprature?");
		int fahr=sc.nextInt();
		int celsius=((fahr-32)*5)/9;
		System.out.println("The temperature in "+city+" is "+celsius);

	}

}
