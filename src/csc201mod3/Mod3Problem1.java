//@author Peyton Starr
//@unit Module 3
//@assignment Programming Problems
//@problem PROBLEM 3 - HIGH SCHOOL LOCKER

package csc201mod3;

import java.util.Arrays;
import java.util.Scanner;

public class Mod3Problem1 {

	public static void main(String[] args) {
		// Welcome message
		System.out.println("<Note> Your lock has 40 ticks [0-39].");
		System.out.println("<Note> This program cannot account for scenarios where the "
				+ "first and last numbers in the unlock combination are zeroes.");
		System.out.println("<Note> Your turn attempts must be all at once, not incremental.");
		
		// Create locker and combo for Mickey Mouse
		int[] mSeq = {28,17,39};
		CombinationLock mickeyC = new CombinationLock(mSeq);
		Locker mickeyL = new Locker(100, "Mickey Mouse", 3, mickeyC);
		
		// Create locker and combo for Donald Duck
		int[] dSeq = {35,16,27};
		CombinationLock donaldC = new CombinationLock(dSeq);
		Locker donaldL = new Locker(275, "Donald Duck", 0, donaldC);
		
		// Attempt to open locker for Mickey Mouse and place books inside, print state
		mickeyL.openLocker();
		mickeyL.openLocker();
		mickeyL.putBookInLocker(3);
		System.out.println(mickeyL.getCurrentState());
		
		// Attempt to open locker for Donald Duck and remove book, print state
		donaldL.openLocker();
		donaldL.removeBookFromLocker(1);
		System.out.println(donaldL.getCurrentState());
	}

}

class CombinationLock {
	// Create attributes
	int[] sequence = {0,0,0};
	int[] attempt = {0,0,0};
	int dial = 0;
	boolean isUnlocked = false;
	
	// Create default constructor
	CombinationLock() {
	}
	
	// Create constructor with parms
	CombinationLock(int[] q) {
		this.sequence = q;
	}
	
	// Method to reset dial and attempt variables
	void resetDial() {
		dial = 0;
		attempt[0] = 0;
		attempt[1] = 0;
		attempt[2] = 0;
	}
	
	// Method to turn dial to the right and set first and third unlock attempts
	void turnRight(int ticks) {
		// Set first attempt var
		if (dial == 0 && attempt[0] == 0) {
			attempt[0] = 40-ticks;
			dial = 40-ticks;
			System.out.println("You turned the dial to " + dial);
		}
		// Set third attempt var
		else if (dial != 0 && attempt[0] != 0) {
			if (ticks <= dial) {
				dial = dial - ticks;
				attempt[2] = attempt[1] - ticks;
			}
			else {
				dial = 40 - (ticks-dial);
				attempt[2] = 40 - (ticks-attempt[1]);
			}
			System.out.println("You turned the dial to " + dial);
			
		}
		// Notify of invalid attempt [DEBUG]
		else System.out.println("Invalid right turn.");
	}
	
	// Method to turn dial to the left and set second unlock attempt
	void turnLeft(int ticks) {
		// Set second attempt if user has not done a full turn before attempt
		if (ticks < 40) {
			attempt[1] = 0;
			System.out.println("Invalid left turn. You need to do one full turn.");
		}
		// Set second attempt value if valid attempt
		else if (dial != 0 && attempt[0] != 0) {
			if ((ticks%40)+dial < 40) {
				dial = dial + (ticks%40);
				attempt[1] = attempt[0] + (40%ticks);
			}	
			else {
				dial = dial-(40-(ticks%40));
				attempt[1] = attempt[0]-(40-(ticks%40));
			}
			System.out.println("You turned the dial to " + dial);
		}
		// Notify of invalid attempt [DEBUG]
		else System.out.println("Invalid left turn.");
	}
	
	// Method to check if attempts were valid
	void openLock() {
		if (Arrays.equals(sequence, attempt)) {
			isUnlocked = true;
			System.out.println("Successful unlock attempt! Your locker is open.");
		}
		else System.out.println("Unsuccessful unlock attempt! Try again.");
	}
	
	// Method to print attributes of class
	public String toString() {
		return Arrays.toString(sequence) + Arrays.toString(attempt) + dial + isUnlocked;
	}
}

class Locker {
	// Create attributes
	int lockerNum;
	String studentName;
	CombinationLock combo;
	int numberOfBooks;
	
	// Create scanner object for user input and variable for use
	Scanner input = new Scanner(System.in);
	int tick;
	
	// Create default constructor
	Locker() {
		this(0,"John Doe", 0, null);
	}

	// Create constructor with parms
	Locker(int lockerNum, String studentName, int numberOfBooks, CombinationLock combo) {
		this.lockerNum = lockerNum;
		this.studentName = studentName;
		this.numberOfBooks = numberOfBooks;
		this.combo = combo;
	}
	
	// Method to allow further operations on lock object, calls CombinationLock class
	public void openLocker() {
		if (combo.isUnlocked) System.out.println("This locker is already open!");
		else {
			System.out.println("Let's try to open " + studentName + "'s locker.");
			
			// Reset dial
			combo.resetDial();
			
			// Set first unlock number
			System.out.print("Ticks to turn to the right: ");
			tick = input.nextInt();
			combo.turnRight(tick);
			
			// Set second unlock number
			System.out.print("Ticks to turn to the left: ");
			tick = input.nextInt();
			combo.turnLeft(tick);
			
			// Set first unlock number
			System.out.print("Ticks to turn to the right again: ");
			tick = input.nextInt();
			combo.turnRight(tick);
			
			// Try to unlock using openLock method
			combo.openLock();
		}
	}
	
	// Method to add to book count
	void putBookInLocker(int n) {
		if (!combo.isUnlocked) System.out.println("You must unlock your combination lock first.");
		else {
			numberOfBooks = numberOfBooks + n;
			System.out.println("You now have " + numberOfBooks + " books in the locker.");			
		}	
	}
	
	// Method to minus book count
	void removeBookFromLocker(int n) {
		if (!combo.isUnlocked) System.out.println("You must unlock the locker first.");
		else if (n > numberOfBooks) System.out.println("There are not enough books in the locker.");
		else {
			numberOfBooks = numberOfBooks - n;
			System.out.println("You now have " + numberOfBooks + " books in the locker.");
		}
	}

	// Method to print attributes of class
	public String getCurrentState() {
		return "Locker number " + lockerNum + " is owned by " + studentName + ". It currently has " + numberOfBooks + " books inside.";
	}
	
	// Method to print attributes of class
	public String toString() {
		return lockerNum + studentName + combo + numberOfBooks;
	}
}