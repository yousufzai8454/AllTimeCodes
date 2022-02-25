package com.syntax.classThursday;

import java.util.Scanner;

public class HomeWorkCalculatorClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num1=0;
		int num2=0;
		char operator;
		
		System.out.println("Plesae enter first number");
		num1=sc.nextInt();
		System.out.println("Please enter second number");
		num2=sc.nextInt();
		System.out.println("What is the operator");
		operator=sc.next().charAt(0);
		
		if(operator=='+') {
			System.out.println("The result is "+(num1+num2));
		}else if (operator=='-') {
			System.out.println("The result is "+ (num1-num2));
		}else if (operator =='*') {
			System.out.println("The result is "+(num1*num2));
		}else if (operator =='/') {
			System.out.println("The resuolt is "+(num1/num2));
		}
		
		System.out.println("a--------------------------------------");
		
		System.out.println("Plesae enter first number");
		num1=sc.nextInt();
		System.out.println("Please enter second number");
		num2=sc.nextInt();
		System.out.println("What is the operator");
		operator=sc.next().charAt(0);
		int result=0;
		
		switch (operator) {
		case'+':
			result=num1+num2;
			break;
		case'-':
			result=num1-num2;
			break;
		case'/':
			if (num2!=0) {
			}else {
				System.out.println("We cannot devide by "+num2);
			}
			result=num1/num2;
			break;
		case'*':
			result=num1*num2;
			break;
		default:
			System.out.println("Invalid Operatro");
			
		}
		System.out.println(result);
	}

}
