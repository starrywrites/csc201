//@author Peyton Starr
//@unit Module 5
//@assignment Programming Problems
//@problem PROBLEM 1 - CYCLE THROW TRY CATCH

package csc201mod5;

import java.util.*;

public class Mod5Problem1 {

	public static void main(String[] args) {
		// Create Scanner object for input and double values
		Scanner input = new Scanner(System.in);
		
		try {
			
			// Get user input
			System.out.print("Please input number of wheels: ");
			double cWheels = input.nextDouble();
			if (cWheels <= 0) throw new IllegalArgumentException();
			System.out.print("Please input weight: ");
			double cWeight = input.nextDouble();
			if (cWeight <= 0) throw new IllegalArgumentException();
			
			// Create Cycle object with parms and print
			Cycle myCycle = new Cycle(cWheels, cWeight);
			System.out.println(myCycle.toString());
			
		} catch (InputMismatchException e) {
			System.out.print("ERROR: Type Mismatch Exception. Input value must be in [0] or [0.0] format.");
		} catch (IllegalArgumentException e) {
			System.out.println("ERROR: Illegal Argument Exception. Values cannot be less than or equal to zero.");
		}
	}

}

class Cycle {
	// Create properties/ class variables
	private double numberOfWheels;
	private double weight;

	// Create default constructor
	Cycle() {
		// Invoke the constructor with parms, assign default values
		this(100,1000);
	}
	
	// Create constructor with two parms
	Cycle(double numberOfWheels, double weight) {
		// Assign constructor parms to class variables
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
	}
	
	// Create method that will return string with both class values
	public String toString() {
		return "This vehicle has " + numberOfWheels + " wheels and weighs " + weight + ".";
	}
}