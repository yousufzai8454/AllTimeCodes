package com.syntax.class06;

public class SwitchCaseThree {

	public static void main(String[] args) {
		/*
		 * declare a variable to store car. 
		 * based on the value of the car define the country of origin. 
		 */
		
		String car ="Ford";
		
		String country = null;
		
		switch (car) {
		
		case "BMW":
			country = "Germony";
			break;
		case "Ford":
			country = "USA";
			break;
		case "Audi":
			country = "Swis";
			break;
		case "RangeRover":
			country = "Englang";
			break;
		case "Raksha":
			country = "Afghanistan";
			break;
		case "Toyota":
			country = "Japan";
			break;
			default:
			break;
					
		}
		System.out.println(car +" is from "+country);
	}

}
