package com.syntax.class12;

public class Horse {

	String name;
	String breed;
	int age;
	double weight;
	
	void run() {
		System.out.println(name+ " is running");
	}
	void eat() {
		System.out.println(name+ " is eating");
	}
	
	void printCompleteInfo() {
		System.out.println("name ="+name);
		System.out.println("breed ="+breed);
		System.out.println("age ="+age);
		System.out.println("weight ="+weight);
		
	}
	
	
	public static void main(String[] args) {
		
		Horse besh=new Horse ();
		besh.name="spirit";
		besh.breed="stallion";
		besh.age=20;
		besh.weight=400;
		besh.run();
		besh.eat();
		
		besh.printCompleteInfo();
		
		System.out.println("***************************");
		
		Horse AyazsHorse=new Horse();
		AyazsHorse.name="Badal";
		AyazsHorse.breed="Mustang";
		AyazsHorse.age=25;
		AyazsHorse.weight=450;
		AyazsHorse.run();
		
		AyazsHorse.printCompleteInfo();
		
	}

}
