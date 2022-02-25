package com.syntax.class02;

public class CreatingVarables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * created a variable and assign a value
		 * 
		 * declared a variable and initialized 
		 * 
		 * both mean the same. 
		 */
		// First way to create a variable. 
		int age=25;
		
		// Second way to create a variable.
		int num; //declare variable  
		num=25;  //initialize it
		num=100; // reassigning the value.
		System.out.println(num);
		
		int n1, n2, n3; //all 3 variables are on the int type 
		
		n1=10;
		n2=20;
		n3=30;
		
		System.out.println(n1 + n2 + n3);
		
			
		
		//ctrl+d will remove the entire line. 
		
		// we can change the value of a variable later on the page, or reassigning the value of variable age. 
		
		age=26;
		
		System.out.println(age);
		
		//Java rules and identifiers. 
		//boolean break=false; ERROR --> do not use keywords as identifiers (name). 
		//boolean break=true; 
		boolean Break=true; 
		
		System.out.println(Break);
		
		
		// char 1character='A'; ERROR --> Do not start the identifier with a number (name) or special characters. 
		
		//Java allows to use _ (under score) and $ sign as identifiers. 
		
		double $price=1.99;
		double _value=3.99;
		
		System.out.println($price);
		System.out.println(_value);
		
		
		
	}
	

}
