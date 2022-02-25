package com.syntax.class02;

public class NonPrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name="Mohammad Salim";
			String lastName="Yousufzai";
			
			//if a phone number doesn't have a special character we can use the long. If it is long add the letter l at the end. 
			
			long phoneNumber=7033098774l;
			
			String mobileNumber="703-309-8774";
			
			System.out.println(phoneNumber);
			
			System.out.println(mobileNumber);
			
			
			String greeting="Hello Friends";
			
			System.out.println(greeting);

			//ShortCut = Syso+ctrl+space --> auto complete print statement. 
			
			System.out.println(name);
			System.out.println(lastName);
			
			//to print name and last name in single print statement. 
			
			System.out.println(name+lastName);
	
			//to add space between name and last name. 
			
			System.out.println(name+" "+lastName);
			
			
			/*
			 * using + we can concatenate. 
			 * string + string
			 * string + int
			 * string + boolean
			 * string + double, char etc...
			 * 
			 */
			int age=43; 
			
			//Mohammad Salim is 43 years old. 
			
			System.out.println(name+ " is "+age +" years old");
			
			// I live on 10873 Test stereet
			String address="10873 Test street";
			System.out.println("I live on "+address);
			
			//String love snow
			String feeling="love";
			String love="snow";
			
			System.out.println("I "+feeling+" "+love);
			
			feeling="like";
			love="tired";
			
			System.out.println("I "+feeling+" "+love);
			
	}

}
