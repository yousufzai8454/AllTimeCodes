package com.syntax.class03;

public class PrimitiveCasting {
 
	 //when you forget to add main class. To write the main method by short cut. 
	//type main ctrl+space --> autocomplete. 
	
	public static void main(String[] args) {
		
		int i=10;
		
		//widening or implicit
		//we store int value 10 inside doubel bariable. 
		
		double d=10;
		
		System.out.println(i);
		System.out.println(d);
		
		//int num=10.0; //type mismatch: error 
		
		
		int num=(int)10.99;
		System.out.println(num);
		
		float f=10.99f;
		
		byte b=(byte)1000;
		System.out.println(b);
				
		
	}
	
}
