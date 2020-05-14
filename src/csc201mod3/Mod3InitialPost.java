//@author Peyton Starr
//@unit Module 3
//@assignment Initial Discussion Post
//@problem Chapter 9, Problem 4, Page 363

package csc201mod3;

import java.util.Random;

public class Mod3InitialPost {

	public static void main(String[] args) {
		// Create Random object
		Random rand = new Random(1000);
		
		// A for loop that repeats 50 times and prints a number between 0-100 each time
		for (int i = 0; i < 50; i++) {
			System.out.println(rand.nextInt(100));
		}
	}

}
