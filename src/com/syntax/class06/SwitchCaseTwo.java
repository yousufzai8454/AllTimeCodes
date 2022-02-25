package com.syntax.class06;

public class SwitchCaseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char choice ='m';
		
		String answer;
		
		switch (choice) {
			
		case 'y':
			answer = "Yes";
			break;
			
		case 'n':
			answer = "No";
			break;
			
		case 'm':
			answer = "Maybe";
			break;
		default:
			answer = "Unknown";
			break;
					
		}
		System.out.println(answer);
		
	}

}
