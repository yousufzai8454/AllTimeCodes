package com.syntax.class11;

public class Task9 {

	public static void main(String[] args) {
		/*
		 * Maximum and minimum number in the array?
		 */

		int[] array = { 10, 20, 30, 40, 100, 50, 60, 70 };

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int elements : array) {
			if (elements > largest) {
				secondLargest = largest;
				largest = elements;

			}else if (elements>secondLargest &&elements!=largest) {
				secondLargest=elements;
			}
		}
		System.out.println("Largest "+largest);
		System.out.println("Second Largest "+secondLargest);

	}

}
