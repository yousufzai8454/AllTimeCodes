package com.syntax.class14;

public class StringDemo1 {

	public static void main(String[] args) {
		String name="Salim";// always use the shorter one. 
		
		String name2=new String("SALIM");
		
		System.out.println(name);
		System.out.println(name2);
		
		System.out.println(name.length());
		System.out.println(name2.toLowerCase());
		System.out.println(name.toUpperCase());
		
		System.out.println(name+" "+name2);//you should always prefer to use this method to perform concatenation. 
		System.out.println(name.concat(" " + name2));
		name="";
		System.out.println(name.isEmpty());
		
		

		
		
	}

}
