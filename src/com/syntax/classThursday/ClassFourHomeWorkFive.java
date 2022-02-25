package com.syntax.classThursday;

import java.util.Scanner;

public class ClassFourHomeWorkFive {

	public static void main(String[] args) {
		// Home work 5. 
		Scanner me=new Scanner(System.in);
		System.out.println("Enter your number of worked years");
		int year =me.nextInt();
		if(year>=5) {
			System.out.println("You are eligible for bonus");
			System.out.println("Enter your annual salary");
			int salary=me.nextInt();
			if (salary>50000){
				System.out.println("Your bonus is 5000");
			}else {
				System.out.println("Your bonus is 3000");
				
			}
			System.out.println("You are not eligible for bonus!!");
		}
		
	}

}
