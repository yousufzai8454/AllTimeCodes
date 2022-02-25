package com.syntax.classThursday;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 1500;
		byte number2 = (byte) number;
		System.out.println(number2);

		// boolean(1)-->byte(8)-->short(16) char(16)-->int(32) float(32)--> long(64)
		// double(64)

		boolean a, b, c;
		a = b = c = true;

		if (!a || (b && c)) {
			System.out.println("If executed");
		} else {
			System.out.println("else executed");
		}

	}
}
