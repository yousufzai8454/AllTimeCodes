package com.syntax.class06;

import java.util.Scanner;

public class StoringIntoVariable {

	public static void main(String[] args) {
		
		/*
		 *  Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 

		if the average score >=90 → grade=A
		if the average score >= 70 and <90 → grade=B
		if the average score>=50 and <70 → grade=C
		if the average score<50 → grade=F
		 */
				
		    Scanner input = new Scanner(System.in);
		    System.out.println("Please enter first quiz score:");
		    int quiz_score = input.nextInt();
		    System.out.println("Please enter mid-term quiz score:");
		    int mid_term_score = input.nextInt();
		    System.out.println("Please enter final quiz score:");
		    int final_score = input.nextInt();

		    int avg_score = (quiz_score + mid_term_score + final_score) / 3;
		    
		    char grade=0;
		    
		    
		    if(avg_score >= 90){
		        grade='A';
		        
		    } else if(avg_score >= 70 && avg_score < 90){
		        grade='B';
		        
		    } else if(avg_score >= 50 && avg_score < 70){
		        grade='C';
		        
		    } else if(avg_score < 50){
		        grade='F';
		    }
		        System.out.println("Your grade is "+grade);
		        
		        if (grade=='A' || grade=='B') {
		        	System.out.println("You are a great studnet.");
		        }else {
		        	System.out.println("You have to study hard to pass your tests.");
		        }
		    
		}

	}


