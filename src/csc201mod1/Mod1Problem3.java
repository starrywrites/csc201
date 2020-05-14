// BROKEN GPS

package csc201mod1;

import java.util.Random;

public class Mod1Problem3 {

	public static void main(String[] args) {		
		// Declare variables to count the minutes and set initial position
		int mins = 0;
		int x = 0;
		int y = 0;
		
		while (mins <60) {
			// Get a random int from 0-3 representing North, South, East, and West in order
			int r = new Random().nextInt(4);
				
			// Change x or y position
			if (r==0) y++;
			else if (r==1) y--;
			else if (r==2) x++;
			else if (r==3) x--;
			// Add minutes
			mins = mins + 5;
			
		}
		
		// Calculate distance
		double totalDist;
		if (x==0) totalDist = Math.abs(y);
		else if (y==0) totalDist = Math.abs(x);
		else {
			int xDist = x-0;
			int yDist = y-0;
			totalDist = Math.sqrt(Math.pow(xDist, 2) + Math.pow(yDist, 2));
		}
		
		System.out.print("Your broken GPS took you " + totalDist + " units away from your inital position!");
	}

}
