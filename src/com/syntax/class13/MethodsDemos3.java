package com.syntax.class13;

public class MethodsDemos3 {

	//create a methods to give me the squire root of a number. 
	// int we specify the data type that methods will return.
	//squareTheNumber name of the method
	//return tell java what to return from this method. 
	
	int squareTheNumber(int number) {
		return number*number;
		
	}
	
	int returnTheSameNumber(int number) {
		return number;
		
	}
	String getproperAnimalByExpert(String expertName, String animalName) {
		if("Teyfur".equalsIgnoreCase(expertName) && "Horse".equalsIgnoreCase(animalName)) {
			return "camel";
		}else if("Horse".contentEquals(animalName)) {
			return "Horse";
		}else {
			return"I don't know";
		}
	}
	
	
	public static void main(String[] args) {
		
		MethodsDemos3 obj=new MethodsDemos3();
		int result = obj.squareTheNumber(5);
		System.out.println(result);
		int result1 = obj.returnTheSameNumber(5);
		System.out.println(obj.getproperAnimalByExpert("Teyfur", "Horse"));
		System.out.println(obj.getproperAnimalByExpert("Tameer", "Horse"));
		System.out.println(obj.getproperAnimalByExpert("Teyfur", "Monkey"));

	}

}
