package com.syntax.class08;

import java.util.Scanner;

public class HomeWorkClass7Coffee {

	public static void main(String[] args) {
		// coffee homework
		
		double price =2.99;
		
		System.out.println("Please pay for your coffee");
		
		Scanner in = new Scanner(System.in);
		double pay;
		
		do {
			pay = in.nextDouble();
			if (pay > price) {
				System.out.println("Please give less");
				
			}else if (pay < price) {
				System.out.println("Please give more money");
			}
			
		}while (pay != price);
		
		System.out.println("Please enjoy your coffee");
		

	}

}
