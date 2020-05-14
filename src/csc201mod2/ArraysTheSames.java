// @author Peyton Starr
// @unit Module 2
// @assignment Initial Discussion Post
// @problem Chapter 8, Problem 28, Page 318

package csc201mod2;

import java.util.Scanner;

public class ArraysTheSames {
	
	// Creating a new class/method as specified by the problem
	public static boolean equals(int[][] m1, int[][] m2) {		
		boolean isSame = java.util.Arrays.equals(m1, m2);
		return isSame;
	}
	
	public static void main(String[] args) {
		// Give user instructions
		System.out.println("INSTRUCTIONS:");
		System.out.println("This program allows you to compare two 3x3 arrays to see if they are strictly identical.");
		System.out.println("Please enter the numbers for the arrays left to right, working down from the top.");
		System.out.println("You may separate the numbers by spaces on the same line.");
		
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Declare arrays
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		
		// Get array values from the user for the first array and print to see
		System.out.print("Enter list 1: ");
		for (int i =0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[j][i] = input.nextInt();
			}
		}
		System.out.print("Your first list: ");
		System.out.println("{" + x[0][0] + ", " + x[1][0] +  ", " + x[2][0] + "} " 
							+ "{" + x[0][1] + ", " + x[1][1] +  ", " + x[2][1] + "} "
							+ "{" + x[0][2] + ", " + x[1][2] +  ", " + x[2][2] + "}");
		
		// Get array values from the user for the second array and print to see		
		System.out.print("Enter list 2: ");
		for (int i =0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				y[j][i] = input.nextInt();
			}
		}		
		System.out.print("Your second list: ");
		System.out.println("{" + y[0][0] + ", " + y[1][0] +  ", " + y[2][0] + "} " 
				+ "{" + y[0][1] + ", " + y[1][1] +  ", " + y[2][1] + "} "
				+ "{" + y[0][2] + ", " + y[1][2] +  ", " + y[2][2] + "}");	
		
		// Call the class that the problem wants me to have for some reason
		boolean result = equals(x, y);
		
		// Print result
		if (result) System.out.println("These arrays are stricly identical.");
		else System.out.println("These arrays are NOT stricly identical.");
	}

}
