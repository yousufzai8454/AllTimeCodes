package com.syntax.class14;

public class Task3 {
	// Create a method that will say Hello in different language based 
			//on the country that will passed when method is executed.
	
	String sayHello(String country) {
		
		switch(country) {
		case "USA":
			return"Hello";
			
		case "Afghaistan":
			return"Aslamualikom";
			
		case "Turkey":
			return"Marhaba";
		
		default:
			return"Zulfiya is a good studnet";
			
		}
	}
	
	
	public static void main(String[] args) {
		
		Task3 obj=new Task3();
		obj.sayHello("Afghanistan");
		obj.sayHello("USA");
		String country=obj.sayHello("Turkey");
		System.out.println(country);

	}

}
