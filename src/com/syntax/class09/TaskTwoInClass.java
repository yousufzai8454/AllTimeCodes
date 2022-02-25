package com.syntax.class09;

public class TaskTwoInClass {

	public static void main(String[] args) {
		// Class task two. 
		//Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).


//Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).


//		Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding Day”. 
		
		char[] grade=new char[6];
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		
		char[] grade1= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.println(grade[1]);
		
		System.out.println("----------------------------");
		
		
		String[]names=new String[5];
		
		names[0]="Maha";
		names[1]="MOhammad";
		names[2]="Sofia";
		names[3]="Ali";
		names[4]="Gulnar";
		
		System.out.println(names[4]);
		
		String[]names1= {"Maha", "Mohammad", "Sofia", "Ali", "Gulnar"};
		
		System.out.println(names1[3]);
	
				
		String[] words= {"Nice", "Friday", "Saturday", "Love"};
		
		System.out.println(words[2]+" is Java coding Day");
		
	}
		
		
}


