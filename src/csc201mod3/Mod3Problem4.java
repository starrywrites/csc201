//@author Peyton Starr
//@unit Module 3
//@assignment Programming Problems
//@problem PROBLEM 4 - BUILDER

package csc201mod3;

import java.util.Scanner;

public class Mod3Problem4 {

	public static void main(String[] args) {
		// This is the main class used to call the Builder class
		Builder build = new Builder();
		
		// Get object stringbuilder variable and print it out
		StringBuilder myStrObj = build.getString();
		System.out.println("YOUR STRING: " + myStrObj);

		// Get object stringbuilder variable and print it out
		int myCapObj = build.getStringCapacity();
		System.out.println("The final capacity of your string is: " + myCapObj);
	}
}
	
class Builder {
	// Create Stringbugger objects for class
	StringBuilder str = new StringBuilder();
	int strLen = 0;
	int strCap = 0;
	
	// Create Scanner object
	Scanner input = new Scanner(System.in);
	
	// Set constructor for the Builder class/object without parm
	public Builder(){
		setString();
		setStringAtEnd();
		setStringAtLoc();
	}
	
	public void setString() {
		// Get user input
		System.out.print("Please input your initial string: ");
		StringBuilder temp = new StringBuilder(input.nextLine());
		
		// Set the str var and strLen var
		str = temp;
		strLen = str.length();
	}

	public void setStringAtEnd() {		
		// Set a new StringBuilder to be appended to the end
		StringBuilder temp = new StringBuilder("I love it!");
		
		// Alter the str var
		str.insert(strLen, temp);	
	}
	
	public void setStringAtLoc() {		
		// Get user input
		System.out.print("Please input a new string to add: ");
		StringBuilder temp = new StringBuilder(input.nextLine());
		
		// Get user input
		System.out.print("Please input the index where you want to insert the new string: ");
		int intIndex = input.nextInt();
		
		// Alter the str var and set your final capacity
		str.insert(intIndex, " " + temp);
		strCap = str.capacity();
	}
	
	StringBuilder getString() {
		return str;
	}
	
	int getStringCapacity() {
		return strCap;
	}
}
