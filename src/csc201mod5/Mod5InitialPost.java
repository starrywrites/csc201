//@author Peyton Starr
//@unit Module 5
//@assignment Discussion Posts
//@problem INITIAL POST - Chapter 12, Problem 23, Page 495
//@description
// Source: http://liveexample.pearsoncmg.com/data/Scores.txt
// The above source contains an unspecified number of scores separated
// by spaces. Write a program that reads the scores from the file and
// displays their total and average.

package csc201mod5;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Mod5InitialPost {

	public static void main(String[] args) {
		// Create an Integer ArrayList for the data
		ArrayList<Integer> payload = new ArrayList<>();
		
		try {
			// Create URL object for the data source
			URL url = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");
			
			// Create Scanner object to read web data
			Scanner input = new Scanner(url.openStream());
			
			// Feed data source into the payload ArrayList variable
			while (input.hasNext()) {
				payload.add(input.nextInt());
			}
		
		// A bunch of catch statements to catch exceptions
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Print original output
		System.out.println("Your scores: " + payload);
		
		// Get sum of all the integers in the ArrayList and print
		int psum = 0;
		for (int i = 0; i < payload.size(); i++) psum += payload.get(i);
		System.out.println("The sum of your scores: " + psum);
		
		// Get average of integers in ArrayList and print
		double pavg = psum / payload.size();
		System.out.println("The average of your scores: " + pavg);
	}

}
