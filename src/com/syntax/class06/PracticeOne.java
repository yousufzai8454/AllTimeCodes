package com.syntax.class06;

import java.util.Scanner;

public class PracticeOne {

	public static void main(String[] args) {
		// Complier practice
		
		Scanner numb=new Scanner(System.in);
		
		int num=numb.nextInt();
		
		int num1=5500;
		int num2=3500;
		int num3=4501;
		
		int largest=0;
		
		if (num1>num2 && num1>num3){
			largest=num1;
			
		}else if (num2>num1 && num2>num3) {
			largest=num2;
			
		}else if(num3>num1 && num3>num2) {
			largest=num3;
		}
			System.out.println(largest);
			
			if(largest%2==0) {
				System.out.println(largest+" is even number.");
			}else {
				System.out.println(largest+" is odd number.");
			}

	}

}
