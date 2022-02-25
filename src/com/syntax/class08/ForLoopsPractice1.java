package com.syntax.class08;

public class ForLoopsPractice1 {

	public static void main(String[] args) {
		// For loops
		
		for (int i=1; i<=3; i++) {
			
			
			
			System.out.println("Hello"+i);
		}
		
		System.out.println(" Muliplication Table ");
		
		/*
		 * 3 X 1 = 3
		 * 
		 * 
		 * 
		 * 3 X 10 = 30
		 */
		int num=3;
		int result;
		
		for (int i=1; i<=10; i++) {
			
			result=num*i;
						
			System.out.println(num+ " X "+i+ " = "+result);
		}
		
		System.out.println(" -What is the outpupt");
		
		for (int i=0; i<=10; i+=3) {
			
			System.out.println(i+" ");
		}
		
		System.out.println("_ what is the output");
		
		int sum=0;
		
		for(int i=1; i<=5; i++) {
			
			sum+=i;
			System.out.println(sum);
		}
		
		System.out.println("--What is the output");

		int value =1;
		
		for (int i=1; i<4; i++)
		{
			value *=i;
			System.out.println(value);
					
		}

		
			
		

	}

}
