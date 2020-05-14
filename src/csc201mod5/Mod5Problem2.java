//@author Peyton Starr
//@unit Module 5
//@assignment Programming Problems
//@problem PROBLEM 2 - CYCLE FILE OUTPUT

package csc201mod5;

import java.io.*;

public class Mod5Problem2 {
	public static void main(String[] args) {
		// Create Cycle object
		Cycle2 someCycle = new Cycle2(3, 55);
		
		try {
			// Create java.io.File object
			java.io.File file = new java.io.File("Cycle.txt");
			
			// Check that the file exists
			if (file.exists()) System.out.println("File already exists. Overwriting...");
			else System.out.println("File does not exist. Creating new...");
					
			// Create PrintWriter object using java.io.File object
			PrintWriter output = new PrintWriter(file);
			
			// Write object properties to file
			System.out.println(someCycle.toString());
			output.println(someCycle.toString());
			
			// Close the file you created
			output.close();
		
		// Catch any possible exceptions
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}

class Cycle2 {
	// Create properties/ class variables
	private int numberOfWheels;
	private int weight;

	// Create default constructor
	Cycle2() {
		// Invoke the constructor with parms, assign default values
		this(100,1000);
	}
	
	// Create constructor with two parms
	Cycle2(int numberOfWheels, int weight) {
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
	}
	
	// Create method that will return string with both class values
	public String toString() {
		return "Vehicle properties:\nNumber of Wheels = " + Integer.toString(numberOfWheels) + "\nWeight = " + Integer.toString(weight);
	}
}

