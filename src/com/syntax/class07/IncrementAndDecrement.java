package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
		
		num=num+1;
		num+=1;
		num++;
		
		System.out.println(num);

		//increment operator add 1 to a Variable. 
		//10++; will give compiler error--> Invalid argument operation ++/--
		//decrent operator subtructs 1 from a variable. 
		
		num--;
		num--;
		num--;
		
		System.out.println(num);
		
	}

}
