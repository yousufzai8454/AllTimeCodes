package com.syntax.classThursday;

import java.util.Scanner;

public class PraciceSesion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner personel = new Scanner(System.in);
		  
		  System.out.println("Please enter your gender: M or F");
		  
		    String gender = personel.next();
		    
		  System.out.println("Please enter your age");
		  
		  int age = personel.nextInt();
		  
		  if(gender.equals("F or M")){
			  
		    if(age>25){
		    	
		      System.out.println("Woman");
		      
		    }else{
		    	
		      System.out.println("Man");
		        }
		  }else{
			  
		    if(age<25){
		    	
		      System.out.println("Girl");
		      
		    }else{
		      System.out.println("Boy");
		    }
		  }

		  }

}
