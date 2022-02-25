package com.syntax.class03;

public class moreExmple {

	public static void main(String[] args) {
		
		/*
		 * We need to declare a boolean variable hungry yes or no
		 * 
		 * if we are hungry --> i am going to eat
		 * otherwise --> I am going to drink a tea.
		 */
		
		boolean hungry=false;
		
		if(hungry==true) {
			System.out.println("I am going to eat");
		}else {
			System.out.println("I am giong to drink a tea");
		}
		boolean traffic=true;
		
		if(traffic) {
			System.out.println("I am comming home late.");
		}else {
			System.out.println("I wil be home on time.");
		}
		/*define a variable to store a browser
		 * 
		 * if broswer is chorme --> we are executing tests on chorme
		 * otherwise --. I am not executing any test cases. 
		 */
		//always use equeals to compare 2 strings. 
		String browser="chrome";
		if (browser.equals("chrome")) {
			System.out.println("we are executing tests on chrome");
		}else {
			System.out.println("We are not executing any test cases");
		}
		
		//would work but not preferable 
		String browser1="chrome";
		if (browser==("chrome")) {
			System.out.println("we are executing tests on chrome");
		}else {
			System.out.println("We are not executing any test cases");
		}
		
		/* 
		 * define a variable to storte a valure of day. 
		 * if day is saturday --> I am having Java class today. 
		 * othersise --> I don't know which class
		 */
		String today="Saturday";
		
		if(today.equals("Saturday")) {
			System.out.println(" I am going to have java class today");
			System.out.println("I am tired and sick will love to have some rest");
		}else {
			System.out.println("I don't know which class I have");
		}
		
		int day =1;
				
				if (day ==1) {
			System.out.println("Monday");
		}else if(day ==2){
			System.out.println("Tuesday");
		}else if(day ==3){
			System.out.println("Wednesday");
		}else if(day ==4){
			System.out.println("Thursday");
		}else if(day ==5){
			System.out.println("Friday");
		}else if(day ==6){
			System.out.println("Saturday");
		}else if(day ==7){
			System.out.println("Sunday");
		}
		
		int month=1;
		
		if(month==1) {
			System.out.println("January");
		}
		if(month==2) {
			System.out.println("February");
		}
		if(month==3) {
			System.out.println("March");
		}
		if(month==4) {
			System.out.println("April");
		}
		if(month==5) {
			System.out.println("May");
		}
		if(month==6) {
			System.out.println("June");
		}
		if(month==7) {
			System.out.println("July");
		}
		if(month==8) {
			System.out.println("August");
		}
		if(month==9) {
			System.out.println("September");
		}
		if(month==10) {
			System.out.println("October");
		}
		if(month==11) {
			System.out.println("November");
		}
		if(month==12) {
			System.out.println("December");
	
		}
	}

}
