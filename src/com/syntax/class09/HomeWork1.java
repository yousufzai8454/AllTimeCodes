package com.syntax.class09;

public class HomeWork1 {

	public static void main(String[] args) {
		// Homework 1
		
		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.


		//Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.


		//Create an array on integers and calculate the sum of all elements in an array


		//From an array of integer elements find the largest number.

		
		String[] cars= {"MBW", "Toyota", "MBenz", "Honda", "Huyundi", "Kia"};
		
		for (String car:cars) {
			System.out.print(car+" ");
			
		}
		
		System.out.println();
		
		System.out.println("----------------------------------------------");
		
				
		for (int a=0; a<cars.length; a++) {
				System.out.print(cars[a]+" ");
		}
		
		
	}
	

}
