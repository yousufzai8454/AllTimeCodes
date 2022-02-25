package com.syntax.class10;

public class AllFrom2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][]food= {
				
				{"rebull", "burger", "Steak", "Fries"},
				{"Curry", "Biriayni", "Butter chicken"},
				{"Noodles", "Pad Tahi", "Tom yum"},
				{"Pizza", "pasta"}
			};
		
		for (int row=0; row<food.length; row++) {
			
			
			for(int col=0; col<food[row].length; col++) {
				
				System.out.print(food[row][col]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("---------------All values from 2D using for each loop--------------");
		
		//outer loops over each array inside 2D Array
		for (String [] cousine :food) {
			
			//inner loop over each element from selected array
			for (String f:cousine) {
				
				System.out.print(f+" ");
			}
			System.out.println();
		}
	}

}
