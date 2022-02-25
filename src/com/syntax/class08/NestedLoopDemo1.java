package com.syntax.class08;

public class NestedLoopDemo1 {

	public static void main(String[] args) {
		// NextedLoop
		
		for (int i=1; i<=3; i++) {
			System.out.println("I am i loop"+i);
			
			
			for (int j=1; j<=2; j++) {
				System.out.println("I am nested j loop "+j);
			}
			
			
			
			System.out.println("---------------------------------------------------------");
			
			}
		for (int i=1; i<=4; i++ ) {
			
			System.out.println(i);
			
			for(int j=1; j<3; j++) {
				
				System.out.println(j);
				
		}
			System.out.println("-- -- -- ");

	}
		System.out.println("-------------------------CAR MILAGE--------------------------------");

		
		for (int a=0; a<=9; a++) {
			
			for (int b=0; b<=9; b++) {
				
				for (int c=0; c<=9; c++) {
					System.out.println(a+" "+b+" "+c);
				}
				// clock
				 System.out.println("Clock:");
				 for(int h=1; h<=12; h++){
				     for(int m=0; m<60; m++){
				         for(int s=0; s<60; s++){
				             System.out.println(h+":  "+m+":  "+s);
			}
		
		}
}
			}
		}
	}
}
