package com.syntax.class09;

public class ArrayTask {

	public static void main(String[] args) {
		// Calls work.
		
		
		double [] price=new double[4];
		
		
		price[0]=25;
		price[1]=30;
		price[2]=20;
		price[3]=15;
		
		double aveMoney=(price[0]+price[1]+price[2]+price[3]/4);
		
		System.out.println("$" + aveMoney);
		

	}

}
