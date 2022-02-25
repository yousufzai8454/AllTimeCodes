package com.syntax.class07;

public class DoWhileLoop1 {

	public static void main(String[] args) {
		// Do While Loop. 
		System.out.println("------While checks condation before execution----------");
		
		int num = 1;
		
		while (num<=3) {//While loop is more used than do while loop.
			System.out.println("Hello");//Hello will be printed 5 times. 
			num++;
		}
		
		System.out.println("------Do While checks condation after execution----------");
		
		int num1=1;
		
		do {// is is used less the while loop. 
			System.out.println("Hello");
			num1++;
		}while (num1<=3);

		
		System.out.println("I want to print numbers from 1 to 30 using do while loop");
		
		int num2=1;
		
		do {
			System.out.print(num2+" ");
			num2++;
		}while (num2<=30);
		
		{
			
			
		}
	}

}
