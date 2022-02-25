package com.syntax.class04;

public class ThirdClassWork {

	public static void main(String[] args) {
		
		int age=18;
		int weight =100;
		
		if(age >= 18) {
			System.out.println("You are eligible lets check your weight");
			
			if (weight >= 112) {
				System.out.println("You are eligible to donate the blood");
			}else {
				System.out.println("Sorry yu are not eligible to donate");
			}
		}else {
			System.out.println("You are  not eligible");
			/*'
			 * Else block cannot exist by itself 
			 * else { 
			 * system.out.println("conditions is false")
			 */
		}
	}
}
