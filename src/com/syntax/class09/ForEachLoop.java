package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cities= {"Washington DC ", "Boston", "Miami", "Los Angeles", "New York"};
		
		for (String city:cities) {
			
			System.out.println(city);
		}
		
		System.out.println("--------------------------------------------------------");
		
		
		int[] numbers= {10, 20, 30, 40};
		
		for (int num:numbers) {
			System.out.println(num);
		}
		
		System.out.println("--------------------------------------------------------");
		
		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		for (char grade:grades) {
			
			System.out.println(grade+" ");
		}
		
		System.out.println("--------------------------------------------------------");
		
		
	String[] countries=new String[5];
		
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Afghanistan";
		countries[3]="Moldova";
		countries[4]="Morocco";
		//countries[5]="Turkey";
		
		for(String count:countries) {
			
			System.out.print(count+" ");
		}
	}

}
