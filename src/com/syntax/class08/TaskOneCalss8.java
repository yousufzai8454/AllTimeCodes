package com.syntax.class08;

public class TaskOneCalss8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int sum =0;
		int sumOdd=0;
		
		for (int i=1; i<=50; i++) {
			
			if (i %2==0) {
				sum = sum + i;
				
			}else {
				sumOdd=sumOdd+i;
			}
		}
		//System.out.println("The sum of all eve numbers = "+sum+" and the sum of all odd numbers ="+sumOdd);
		
		
		
		
		
		System.out.println("---------------Another Way to Find Odd and Even Numbers--------------");
		
		
		
		sum =0;
		
		for (int i=2; i<=50; i+=2 ) {
			sum+=i;
			
		}
		System.out.print(sum);
		
		int sum1 =0;
		
		for(int i =1; i<=50; i+=2) {
			System.out.print(sum1);
		}
		
	}
}
		
