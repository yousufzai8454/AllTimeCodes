package com.syntax.classThursday;

public class IfElseDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int price =10;
		boolean sale =true;
		char gender ='F';
		double discount=0.15;
		double finalPrice=0; 
		
		if(sale) {
			
			if(gender =='F') {
				if (price>5) {
					
					//finalPrice=finalPrice-finalPrice*discount;
					System.out.println("Line 1");
				}
			}
		}else {
			finalPrice=price;
		}
		
		if(sale && gender=='F' && price>5) {
			//finalPrice=finalPrice-finalPrice*discount;
		}else {
			//finalPrice=price;
			System.out.println("Line 2");
			
		}
	}

}
