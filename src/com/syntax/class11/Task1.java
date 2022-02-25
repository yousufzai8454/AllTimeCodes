package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Pseudo(sodo) programming is the easiest way to start your coding. 
		//Take the size of the aArray using scanner class from the user. 
		//1. Determine the data type. Create an int array of above size. 
		//fill the array with elements from the user using scanner class. 
		//sum all the elements of the array.
		// A class that helps use take the input from the keyborad. 

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the size of the array");
		int size=scan.nextInt();
		System.out.println("Size of the array"+5);
		
		int[] array=new int[size];
		
		System.out.println("Please enter "+size+" element");
		for (int i=0; i<size; i++) {
			System.out.println("Please enter the element for index"+i);
			array[i]=scan.nextInt();
			
			
		}
		//print out the elements of an array with out a loops. 
		System.out.println(Arrays.toString(array));
		
		int sum=0;
		for (int x=0; x<size; x++) {
			sum=sum+array[x];
			
		}
		System.out.println("Sum of Array elements is "+sum);
		
		
	}

}
