// @author Peyton Starr
// @unit Module 2
// @assignment Reply Post
// @problem Chapter 8, Problem 2, Page 308

package csc201mod2;

import java.util.Scanner;

public class GatherTheTiltedLine {
	
	public static double sumMajorDiagonal(double[][] m) {
		// Create sum variable and feed the sum variable with a for-loop
		double d = 0;
		for (int i = 0; i < m.length; i++) {
			d = d + m[i][i];
		}
		
		// Return result
		return d;
		
	}
	
	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Get array size
		System.out.println("Enter the size of your square array: ");
		int size = input.nextInt();
		
		// Declare and initialize the array
		double[][] matrix = new double[size][size];
		
		// Use for-loop to get array values from the user
		System.out.println("Enter a " + size + "-by-" + size + " matrix row by row: ");
		for (int i =0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[j][i] = input.nextDouble();
			}
		}
		
		// Call method and print result
		double diagSum = sumMajorDiagonal(matrix);
		System.out.println("The sum of the major diagnonal is: " + diagSum + "!");
		
	}	
}
