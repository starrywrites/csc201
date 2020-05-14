//@author Peyton Starr
//@unit Module 3
//@assignment Programming Problems
//@problem PROBLEM 5 - CHARACTER ARRAY

package csc201mod3;

import java.io.IOException;
import java.util.Scanner;

public class Mod3Problem5 {

	public static void main(String[] args) throws IOException {
		// Create an object for the CharacterArray class
		CharacterArray myObj = new CharacterArray();
		
		String userInput = myObj.getString();
		myObj.setCharArray(userInput);
		myObj.processArray();
		
	}
}

class CharacterArray {
	// Create character array variable for the class
	char[] ch;
	
	// Set constructor for the CharacterArray class/object without String
	CharacterArray() {
	}
	
	public String getString() {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Get user input
		System.out.print("Please input address: ");
		String keyboardString = input.nextLine();
		
		// Return string
		return keyboardString;		
	}
	
	public void setCharArray(String newStr) {
		// Convert String input to character array and store it in clas char variable
		ch = newStr.toCharArray();
	}
	
	public void processArray() {
		// Creates temp character array
		char[] temp = new char[ch.length];
		
		// For-loop checks whether character is a digit or letter
		// Prints which it is then creates new array based
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				System.out.println("Original character '" + ch[i] + "' is a digit.");
				temp[i] = '*';
			}
			else if (Character.isLetter(ch[i])) {
				System.out.println("Original character '" + ch[i] + "' is a letter.");
				if (Character.isUpperCase(ch[i])) temp[i] = Character.toLowerCase(ch[i]);
				else if (Character.isLowerCase(ch[i])) temp[i] = Character.toUpperCase(ch[i]);
			}
			else {
				System.out.println("Original character '" + ch[i] + "' is neither a digit nor a letter.");
				temp[i] = ch[i];
			}
		}

		// Print temp array
		for (int i = 0; i < ch.length; i++) {
			System.out.print(temp[i]);	
		}	
	}
	
}