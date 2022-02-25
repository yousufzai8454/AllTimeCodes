package com.syntax.class14;

public class Task4 {
	/*
	 * 	Create a method createEmail(). Based on values of users name, lastName
		and email type, your method should return complete email Address.
		Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
	 */
	
		String createEmail(String userName, String lastName, String eamilType) {
			return userName+lastName+"@"+eamilType+".com";
		}
	public static void main(String[] args) {
		

		Task4 obj=new Task4();
		System.out.println(obj.createEmail("Salim", "Yousufzai", "gmail"));
			
	}

}
