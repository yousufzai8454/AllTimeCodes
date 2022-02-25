package com.syntax.class12;

public class DogTask {

	//attributes, fields, properties 
		String name;
		String color;
		String breed;
		char gender;
		int age;
		double weight;
		
		
		//Behaviors , functions and methods. 
		void bark() {
			System.out.println("Dog is barking");
		}
		
		void eat() {
			System.out.println("Dog is eating");
		}
		
		void sleep() {
			System.out.println("Dog is sleeping");
		}

		void printCompleteInfo() {
			System.out.println("name ="+name);
			System.out.println("breed ="+breed);
			System.out.println("age ="+age);
			System.out.println("weight ="+weight);
		}
			
			
			
		public static void main(String[] args) {
			
			//Creating an object scooby from class Dog. 
			DogTask Husky=new DogTask();
			DogTask Buldog=new DogTask();
			DogTask Labrador=new DogTask();
			
			Husky.name="Shino";
			Husky.breed="Husky";
			Husky.age=40;
			Husky.gender='F';
			Husky.weight=220;
		
			Husky.printCompleteInfo();
			System.out.println("*********************************");
			
			Buldog.name="Whitedog";
			Buldog.breed="Buldog";
			Buldog.age=40;
			Buldog.gender='M';
			Buldog.weight=220;
			
			Buldog.printCompleteInfo();
			System.out.println("*********************************");
			
			
			Labrador.name="Blackdog";
			Labrador.breed="Labrador";
			Labrador.age=40;
			Labrador.gender='M';
			Labrador.weight=230;
			
			Labrador.printCompleteInfo();
			System.out.println("*********************************");
						
			/*
			 * Dog is a class
			 * scooby is an object
			 * = is an assignment operator 
			 * new is keyword that we us to create the objects of a class
			 * scanner scan = new Scanner(System.in);
			 * 
			 */

		
			
		

	


	}

}
