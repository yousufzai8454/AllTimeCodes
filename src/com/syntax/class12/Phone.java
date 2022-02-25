package com.syntax.class12;

public class Phone {

	
	String make;
	String model;
	int noOfCamers;
	String Color;
	double screenSize;
	String os;
	
	
	void makeCall() {
		System.out.println("Make a call");
	}
	
	void takePicture() {
		System.out.println("Taking pictures");
	}
	
	
	void printCompleteInfo(){
		
		System.out.println("make "+ make);
		System.out.println("model "+ model);
		System.out.println("Color "+ Color);
		
	}
	
	public static void main(String[] args) {
		
		Phone iPhone=new Phone();
		iPhone.make="Apple";
		iPhone.model="iPhone 13";
		iPhone.noOfCamers=3;
		iPhone.Color="blue";
		iPhone.screenSize=6.8;
		iPhone.os="IOS";
		iPhone.makeCall();
		iPhone.takePicture();
		
		iPhone.printCompleteInfo();
		System.out.println("****************************");
		
		Phone Pixil=new Phone();
		Pixil.make="Google";
		Pixil.model="Pixil";
		Pixil.noOfCamers=3;
		Pixil.Color="red";
		Pixil.screenSize=7.8;
		Pixil.os="Android";
		Pixil.makeCall();
		Pixil.takePicture();
		
		Pixil.printCompleteInfo();
		System.out.println("****************************");
		
		Phone samsung=new Phone();
		samsung.model="Samsung Note 10";
		samsung.noOfCamers=3;
		samsung.Color = "black";
		samsung.screenSize = 6.6;
		samsung.os = "Android";
		samsung.makeCall();
		samsung.takePicture();
		
		samsung.printCompleteInfo();
		System.out.println("****************************");

	}

}
