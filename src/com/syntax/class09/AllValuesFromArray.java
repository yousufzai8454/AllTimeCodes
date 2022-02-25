package com.syntax.class09;

public class AllValuesFromArray {

	public static void main(String[] args) {
		// All values from array

char[] grade= {'A', 'B', 'C', 'D', 'E', 'F'};


	//how many elements inside array? 

		int size=grade.length;
		
		System.out.println("Number of elements is " +size);
		
		/*
		 * 
		 * System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		 * 
		 */
		
		
		
		for (int i=0; i<grade.length; i++) {
			
			System.out.println(grade[i]+" ");
			
			
		}
		
		String[] cities= {"Washington DC ", "Boston", "Miami", "Los Angeles", "New York"};
		
		for (int a=0; a<cities.length; a++) {
			System.out.print(cities[a]+"  ");
			
			if(cities[a].equals("Maami")) {
				System.out.println("I want to live in Miami");
			}
		}
		
	}
	

}
