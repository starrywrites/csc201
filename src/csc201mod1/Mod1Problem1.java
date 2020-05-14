// CALCULATING A NUMBER
// This is programming exercise 28 from chapter 3, from page 115.

package csc201mod1;

import java.util.Scanner;

public class Mod1Problem1 {

	public static void main(String[] args) {
		
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Request the necessary variables for the first rectangle
		System.out.print("What is the x coordinate of the first rectangle? Input: ");
		double x1 = input.nextDouble();
		System.out.print("What is the y coordinate of the first rectangle? Input: ");
		double y1 = input.nextDouble();
		System.out.print("What is the height of the first rectangle? Input: ");
		double h1 = input.nextDouble();
		System.out.print("What is the width of the first rectangle? Input: ");
		double w1 = input.nextDouble();
		
		// Request the necessary variables for the second rectangle
		System.out.print("What is the x coordinate of the second rectangle? Input: ");
		double x2 = input.nextDouble();
		System.out.print("What is the y coordinate of the second rectangle? Input: ");
		double y2 = input.nextDouble();
		System.out.print("What is the height of the second rectangle? Input: ");
		double h2 = input.nextDouble();
		System.out.print("What is the width of the second rectangle? Input: ");
		double w2 = input.nextDouble();
		
		// Stop program if negative height or width entered.
		if (h1<0 || h2<0 || w1<0 || w2<0) {
			System.out.print("Cannot enter negative height or width.");
			System.exit(0);
		}
		
		// Calculate locations of the sides of the first rectangle
		double leftB1 = x1 - (w1/2);
		double rightB1 = x1 + (w1/2);
		double topB1 = y1 + (h1/2);
		double bottomB1 = y1 - (h1/2);
		
		// Calculate locations of the sides of the second rectangle
		double leftB2 = x2 - (w2/2);
		double rightB2 = x2 + (w2/2);
		double topB2 = y2 + (h2/2);
		double bottomB2 = y2 - (h2/2);
		
		// Compare bounds to see where rectangles are in relation to one another
		if (leftB1==leftB2 && rightB1==rightB2 && topB1==topB2 && bottomB1==bottomB2) {
			System.out.print("R1 and R2 are the same size and at the same location.");
		}
		// R2 sidelines are both inside R1 sidelines
		else if ((leftB2 >= leftB1) && (rightB2 <= rightB1)) {
			if ((bottomB2 >= bottomB1) && (topB2 <= topB1)) {
				System.out.print("R2 is inside R1.");
			}
			else if ((bottomB2 >= bottomB1) || (bottomB2 <= topB1)) {
				System.out.print("R2 overlaps R1. [#devnote:sol1]");
			}
			else if ((topB2 <= topB1) || (topB2 >= bottomB1)) {
				System.out.print("R2 overlaps R1. [#devnote:sol2]");
			}
			else {
				System.out.print("R2 does not touch R1. [#devnote:sol3]");
			}
		}
		// R2 sidelines are both outside R1 sidelines
		else if ((leftB2 <= leftB1) && (rightB2 >= rightB1)) {
			if ((bottomB2 <= bottomB1) && (topB2 >= topB1)) {
				System.out.print("R2 envelopes R1.");
			}
			else if ((bottomB2 >= bottomB1) || (bottomB2 <= topB1)) {
				System.out.print("R2 overlaps R1. [#devnote:sol4]");
			}
			else if ((topB2 <= topB1) || (topB2 >= bottomB1)) {
				System.out.print("R2 overlaps R1. [#devnote:sol5]");
			}
			else {
				System.out.print("R2 does not touch R1. [#devnote:sol6]");
			}
		}
		// R2 overlaps on the left or right
		else if (((leftB2 >= leftB1) && (leftB2 <= rightB1)) || ((rightB2 <= rightB1) && (rightB2 >= leftB1))) {
			if ((bottomB2 >= bottomB1) || (bottomB2 <= topB1)) {
				System.out.print("R2 overlaps R1. [#devnote:sol7]");
			}
			else if ((topB2 <= topB1) || (topB2 >= bottomB1)) {
				System.out.print("R2 overlaps R1. [#devnote:sol8]");
			}
			else {
				System.out.print("R2 does not touch R1. [#devnote:sol9]");
			}
		}
		else System.out.print("R2 does not touch R1 at all.");

		input.close();
	}

}
