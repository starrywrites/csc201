// @author Peyton Starr
// @unit Module 2
// @assignment Programming Problems
// @problem GIRL SCOUT COOKIE SALES

package csc201mod2;

import java.util.Scanner;

public class Mod2Problem1 {
	
	public static int numGet(String prompt) {
		// Create Scanner object to read input
		Scanner input = new Scanner (System.in);
		
		// Create loop check and output number result variable
		boolean isValid = false;
		int x = 0;
		
		// Loop which prompts for input until the input is valid
		while (!isValid) {
			System.out.print(prompt);
			x = input.nextInt();
			if (x < 0 || x%1 != 0) {
				System.out.println("Invalid input. Please try again.");
			}
			else break;
		}
		
		//Return valid number output
		return x;	
	}
	
	
	public static void main(String[] args) {
		// Welcome text
		System.out.println("OKAY GIRLS, WHAT ARE OUR SALES NUMBERS THIS YEAR?");
		
		// Get count of the number of girlscouts in the troop
		int girlCount = numGet("Total number of girls in troop: ");
		
		// Create array, cookie count and loop count
		int[] boxes = {0,0,0,0,0};
		int cookies;
		int count = 0;
		
		// Create loop that asks for box count for each girl and feeds it into the array
		while (++count <= girlCount) {
			cookies = numGet("Boxes of cookies for girl #" + count + ": ");
			if (cookies <= 10) boxes[0]++;
			else if (cookies <= 20) boxes[1]++;
			else if (cookies <= 30) boxes[2]++;
			else if (cookies <= 40) boxes[3]++;
			else boxes[4]++;
		}
		
		// Print output table of results
		System.out.println("TOTAL BOXES    |NUMBER OF GIRL SCOUTS");
		System.out.println("0 to 10        |" + boxes[0]);
		System.out.println("11 to 20       |" + boxes[1]);
		System.out.println("21 to 30       |" + boxes[2]);
		System.out.println("31 to 40       |" + boxes[3]);
		System.out.println("41 or more     |" + boxes[4]);
	}
}
