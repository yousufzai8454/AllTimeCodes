package com.syntax.class02;

public class PracticeBooleanWithAlex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0;
		boolean b = (a == 0);
		System.out.println(b);
		
		//Booleans are mostly used with the IF Statements. 
		boolean passedExam = true;
		boolean failedExam = false;
		boolean passedAllExams = false;
		int examCount = 0;
		
		
		if (passedExam) {
			System.out.println("Passed my first exam today!");
			examCount = examCount + 1;
		}
		
		if (passedExam) { 
			System.out.println("Passed my second exam today!");
			examCount = examCount + 1;
		}	
		if (passedExam) {
			System.out.println("Passed my thired exam today!");
			examCount = examCount + 1;
		}
		
		if (examCount == 3);
			passedAllExams = true;{
	}
			
			if (passedAllExams) {
				System.out.println("Congratulation on passing all the exams! ");
			}

			}

}
