//@author Peyton Starr
//@unit Module 5
//@assignment Discussion Posts
//@problem REPLY POST - Chapter 12, Problem 3, Page 492

package csc201mod5;

import java.util.Scanner;

public class Mod5ReplyPost {

	public static void main(String[] args) {
		// Create new Array with 100 integers and feed in 100 random values
		int[] myArray = new int[100];
		for (int i = 0; i < 100; i++) myArray[i] = (int) (Math.random() * 1000);
		
		// Create scanner object for user input
		Scanner input = new Scanner(System.in);

	      try {
	    	 // Request input from user
	    	 System.out.print("Enter the index of the number you want to see: ");
	         int myElement = input.nextInt();
	         
	         // Print element using input
	         System.out.println("The number you requested is: " + myArray[myElement]);
	         
	      } catch(ArrayIndexOutOfBoundsException e) {
	         System.out.println("OUT OF BOUNDS");
	      }
		

	}

}
