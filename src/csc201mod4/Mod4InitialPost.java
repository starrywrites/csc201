//@author Peyton Starr
//@unit Module 4
//@assignment Discussion Posts
//@problem INITIAL POST - Chapter 11, Problem 9, Page 449

package csc201mod4;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod4InitialPost {

	public static void main(String[] args) {
		//Create Scanner object
		Scanner input = new Scanner (System.in);
		
		// Ask for array size from user
	    System.out.print("Enter the array size n: ");
	    int n = input.nextInt();
	    
	    // Create array
	    int[][] mine = new int[n][n];
	    
	    // Fill and print array
	    for (int row = 0; row < n; row++) {
		    for (int col = 0; col < n; col++) {
		    	mine[row][col] = (int) (Math.random() * 2);
		    	System.out.print(mine[row][col]);
		    }
		    System.out.println("");
	    }
	    
	    // Create two loop checks and two count vars
	    int rowCount = 0;
	    int colCount = 0;
	    int rowHigh = 0;
	    int colHigh = 0;
	    
	    // Find the highest values of row and columns
	    for (int i = 0; i < n; i++) {
	    	rowCount = 0;
	    	colCount = 0;
		    for (int j = 0; j < n; j++) {
		    	rowCount = rowCount + mine[i][j];
		    	colCount = colCount + mine[j][i];
		    }
		    if (rowCount >= rowHigh) rowHigh = rowCount;
		    if (colCount >= colHigh) colHigh = colCount;
	    }
	    
	    // Create Array Lists to store index values
	    ArrayList<Integer> rowList = new ArrayList<>();
	    ArrayList<Integer> colList = new ArrayList<>();
	    
	    // Store index values where 
	    for (int i = 0; i < n; i++) {
	    	rowCount = 0;
	    	colCount = 0;
		    for (int j = 0; j < n; j++) {
		    	rowCount = rowCount + mine[i][j];
		    	colCount = colCount + mine[j][i];
		    }
		    if (rowCount == rowHigh) rowList.add(i);
		    if (colCount == colHigh) colList.add(i);
	    }
	    
	    // Print ArrayLists
	    System.out.println("The largest row index is: " + rowList);
	    System.out.println("The largest column index is: " + colList);
	}

}
