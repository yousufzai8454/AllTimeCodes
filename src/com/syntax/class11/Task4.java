package com.syntax.class11;

public class Task4 {

	public static void main(String[] args) {

		// Create the 2D array of integer type where you will store odd and even
		// numbers.

		// Create the 2D array.
		// Store even and odd number in the 2D array.
		// access the elements
		// Check if element is even if it is add it to sumEven variable.
		// Check if element is odd if it is add it to oddEven variable.
		// print the values of both varaible.

		int[][] array2D = { { 2, 3, 4 }, { 5, 6 }, { 12, 6, 8 } };

		int sumEven = 0;
		int sumOdd = 0;

		for (int x = 0; x < array2D.length; x++)

			for (int y = 0; y < array2D[x].length; y++) {
				int element = array2D[x][y];
				if (element % 2 == 0) {
					sumEven+=element;
				}else {
					sumOdd+=element;
				}
					
			}	
		System.out.println("Sum of Even numbers"+ sumEven);
		System.out.println("Sum of Odd numbers"+sumOdd);
		}
					
}
