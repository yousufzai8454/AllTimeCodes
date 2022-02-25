package com.syntax.class10;

public class TaskinClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] countries = { "Afghanistan", "Pakistan", "USA", "Turkey"};
		
		String capital=null; 
		
			
			
		for (int i=0; i<countries.length; i++) {
			switch (countries[i]) {
			
			case "Afghanistan":
				capital="Kabul";
				break;
			case "Pakistan":
				capital="Islamabad";
				break;
			case "USA":
				capital="Washington DC";
				break;
			case "Turkey":
				capital="Istanbol"; 
				break;
				
			}
			System.out.println("The captial of "+countries[i]+" is "+capital);
		}
		
		
		System.out.println();
		System.out.println("--------------------another way-------------------------------");
		
		for (int i=0; i<countries.length; i++) 
		for (String country:countries) {
			
			if (country.equals("Afghanistan")) {
				capital="Kabul";
			}else if (country.equals("Pakistan")) {
				capital="Islamabad";
			}else if (country.equals("USA")) {
				capital="Washington DC";
			}else if (country.equals("Turkey")) {
				capital="Istanbol";
				
				System.out.println("The captial of "+countries[i]+" is "+capital);

			}
			
		}
	
		}
		

	}


