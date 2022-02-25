package com.syntax.class13;

import java.util.Scanner;

public class MethodsDemo1 {

	void checkEvenOdd(int number) {
		if (number%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	
	}
void edward(boolean isRaining) {
		if (isRaining) {
			System.out.println("I am staing home");
		}else {
			System.out.println("Lets go for a walk");
		}//create a method to check a name if name it prints send memes
	}	// otherwise if name is Name is maha prints i am a doctor i am a doctor. 

void checkName(String name) {
	
		if ("Salim".equals(name)) {
			System.out.println("Lets send memes");
		}else if ("Ali".equals(name)) {
			System.out.println("Pay attention on class");
		}else {
			System.out.println("I don't know you. ");
		}
}
	
	
	public static void main(String[] args) {
		
		MethodsDemo1 object1= new MethodsDemo1();
		object1.checkEvenOdd(120);
		object1.checkEvenOdd(3);
		object1.checkEvenOdd(7);
		object1.edward(false);
		object1.checkName("Salim");
		object1.checkName("Ali");
		
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		//int number2=object1.checkEvenOdd(120);
	}	


}
