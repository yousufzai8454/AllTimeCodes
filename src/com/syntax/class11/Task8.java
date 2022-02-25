package com.syntax.class11;

public class Task8 {

	public static void main(String[] args) {
		/*
		 * Maximum and minimum number in the array? 
		 */
		
		int []array= {10, 20, 30, 40, 100, 50, 60, 70 };
		
		
		int largest=array[0];
		int smallest=array[0];
		
		for (int elements:array) {
			if(elements>largest) {
				largest = elements;
			}
			if (elements<smallest) {
				smallest=elements;
			
		}
		}
		System.out.println("Largest numbers is "+ largest);
		System.out.println("Samalest number is "+ smallest);
		
		
	}

}
