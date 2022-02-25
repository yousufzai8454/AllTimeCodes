package com.syntax.classThursday;

public class ArithmaticDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * +, _, *, /, %. 
		 */
		
		int number1=10;
		int number2=10;
		
		System.out.println(number1+number2);
		
		String name1="Abdul";
		String name2="Gulnar";
		
		System.out.println(name1+name2);
		
		char letter1='A'; //65
		char letter2='B'; //66
		
		System.out.println(letter1+letter2);//The result will be only digit since computer understand only numbers. 
		System.out.println(letter1-letter2);
		
		/***************************************/
		
		System.out.println(number1-number2);
		
		//System.out.println(name1-name2); not defined and Java can't minus Strings. 
		
		System.out.println(number1*number2);
		
		System.out.println((int)'A');// To define any letter's value use the commend. 
		
	}

}
