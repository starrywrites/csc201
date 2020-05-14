//@author Peyton Starr
//@unit Module 5
//@assignment Programming Problems
//@problem PROBLEM 3 - CYCLE FILE INPUT

package csc201mod5;

import java.io.*;
import java.util.*;

public class Mod5Problem3 {
	
	public static void main(String[] args) {		
		// Create an Integer ArrayList for the data
		ArrayList<String> payload = new ArrayList<>();
		
		try {
			// Create java.io.File object
			java.io.File file = new java.io.File("Cycle.txt");
			
			// Check that the file exists
			if (file.exists()) System.out.println("File exists. Continuing...");
			else {
				System.out.println("File does not exist. Program exited.");
				System.exit(1);
			}
			
			// Create Scanner object using java.io.File object
			Scanner input = new Scanner(file);
			
			// Read text file to ArrayList
			while (input.hasNext()) {
				payload.add(input.next());
			}
			
			// Close file
			input.close();
			
			// Pull data out of ArrayList with indexes and 
			int cWheels = Integer.parseInt(payload.get(6));
			int cWeight = Integer.parseInt(payload.get(9));
			
			// Create Cycle object
			Cycle3 someCycle = new Cycle3(cWheels, cWeight);
			
			// Print
			System.out.println(someCycle.toString());
		
		// Catch any possible exceptions
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}

class Cycle3 {
	// Create properties/ class variables
	private int numberOfWheels;
	private int weight;

	// Create default constructor
	Cycle3() {
		// Invoke the constructor with parms, assign default values
		this(100,1000);
	}
	
	// Create constructor with two parms
	Cycle3(int numberOfWheels, int weight) {
		// Assign constructor parms to class variables
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
	}
	
	// Create method that will return string with both class values
	public String toString() {
		return "Vehicle properties:\nNumber of Wheels = " + Integer.toString(numberOfWheels) + "\nWeight = " + Integer.toString(weight);
	}
}

