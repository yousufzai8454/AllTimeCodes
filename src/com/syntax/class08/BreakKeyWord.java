package com.syntax.class08;

public class BreakKeyWord {

	public static void main(String[] args) {
		// Break KeyWord
		
		for (int i=1; i<4; i++) {
			
			System.out.println("I am Code inside the loop");
			
			if (i==3) {
				break;
				
			}
			
			
		}
		
		System.out.println("End of the Code");

		boolean winter=true;
		int temp=0;
		
		while(winter) {
			System.out.println("It is cold");
			
			if (temp==20) {
				break;	
				
			}
				
			temp+=5;
			
		}
	}

}
