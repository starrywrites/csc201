//@author Peyton Starr
//@unit Module 4
//@assignment Discussion Posts
//@problem REPLY POST - Chapter 11, Problem 11, Page 449

package csc201mod4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Mod4ReplyPost {
	
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
	}

	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner (System.in);
		
		// Create ArrayList
		ArrayList<Integer> myList = new ArrayList<>();
		
		// Populate ArrayList
		for (int i=0; i < 5; i++) {
			System.out.print("Please input a number into the array (" + (i+1) + " out of 5): ");
			myList.add(input.nextInt());
		}
		
		// Print original ArrayList
		System.out.println("Your original list: " + myList);
		
		// Sort ArrayList
		sort(myList);
		
		// Print sorted ArrayList
		System.out.println("Your ordered list: " + myList);
	}

}
