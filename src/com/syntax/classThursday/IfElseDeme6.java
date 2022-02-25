package com.syntax.classThursday;

public class IfElseDeme6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day ="Sunday";
		
		if(day.equals("Sunday")) {
			System.out.println("Its weekend");
		}else if((day.equals("Satureday"))){
			System.out.println("Its weekday");
			
		}else {
			System.out.println("It is weekday");
			
		}System.out.println("---------------------------------");
		
		if (day.equals("Sunday") || day.equals("Satureday")){
		
		}else {
			System.out.println("Its weekday");
		}
	}

}
