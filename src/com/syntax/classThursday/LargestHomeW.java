package com.syntax.classThursday;

import java.util.Scanner;

public class LargestHomeW {

	public static void main(String[] args) {
		// Homework for the largest number.

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 different numbers");

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 > num3) {
			System.out.println(num1 + " is the largest number");
		} else if (num1 > num3) {

			System.out.println(num3 + " is the largest number");
		}

		{
			if (num2 > num3) {
				System.out.println(num2 + " is the largest number");
			} else
				System.out.println(num3 + " is the largest number");
		}

	}
}
