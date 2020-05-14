//@author Peyton Starr
//@unit Module 3
//@assignment Programming Problems
//@problem PROBLEM 2 - CYCLE

package csc201mod3;

public class Mod3Problem2 {

	public static void main(String[] args) {
		// PART A: Create Cycle object with parms and print
		Cycle kidsTricycle = new Cycle(3, 50);
		System.out.println(kidsTricycle.toString());
		
		// PART B: Create Cycle object without parms (using defult constructor) and print
		Cycle someCycle = new Cycle();
		System.out.println(someCycle.toString());
	}

}

class Cycle {
	// Create properties/ class variables
	private int numberOfWheels;
	private int weight;

	// Create default constructor
	Cycle() {
		// Invoke the constructor with parms, assign default values
		this(100,1000);
	}
	
	// Create constructor with two parms
	Cycle(int numberOfWheels, int weight) {
		// Assign constructor parms to class variables
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
	}
	
	// Create method that will return string with both class values
	public String toString() {
		return "This vehicle has " + Integer.toString(numberOfWheels) + " wheels and weighs " + Integer.toString(weight) + ".";
	}
}
