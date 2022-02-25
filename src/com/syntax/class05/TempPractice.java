package com.syntax.class05;

import java.util.Scanner;

public class TempPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter City");
		String city=input.nextLine();
	
		System.out.println("Please enter Temprature");
				
		int farenhaight , celesius;
		
		farenhaight = input.nextInt();
		
		celesius = ((farenhaight -32)*5/9);
		
		System.out.println("The temprerature in "+city+" is "+ celesius);
		
		
		
		
	}

}
