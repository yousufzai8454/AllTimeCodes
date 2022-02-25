package com.syntax.class12;

public class Greeting {

	void sayHello(String name) {
		
		System.out.println("Hello "+name);
	}
	
	
	void sayHelloManyTimes(String name) {
		
		 for (int i=0; i<5; i++) {
			 
			 System.out.println("Hello "+ name);
		 }
		System.out.println("*********************************");
	}
	
	void sayHelloNNumberofTimes(String name, int times) {
		for (int i=0;i<times;i++) {
			System.out.println("Hello "+ name);
		}
	}
	
	public static void main(String[] args) {
		

		Greeting greeter = new Greeting();
		
		greeter.sayHello("Salim");
		greeter.sayHelloManyTimes("Salim");
		greeter.sayHelloNNumberofTimes("Salim",10);
		
		

	}

}
