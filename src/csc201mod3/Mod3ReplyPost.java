//@author Peyton Starr
//@unit Module 3
//@assignment Initial Discussion Post
//@problem Chapter 4, Problem 12, Page 154

package csc201mod3;

import java.util.Scanner;

public class Mod3ReplyPost {

	public static void main(String[] args) {
		// Create scanner object to accept input
		Scanner input = new Scanner (System.in);
		
		// Prompt for a hex string
		System.out.print("Enter one or more hex digits: ");
		String hexString = input.nextLine();
		
		// Convert String to char array
		char[] ch = hexString.toCharArray();
		// Using for-loop, cycle thru each character in array and check for invalid hex
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i]) && ch[i] >= 'A' && ch[i] <= 'F'); // is valid...
			else if (Character.isDigit(ch[i]) && ch[i] >= '0' && ch[i] <= '9'); // is valid...
			else {
				System.out.println("The character " + ch[i] + " is not a valid hex digit.");
				System.exit(1);			
			}
		}
		
		// Convert String to Decimal
		int num = Integer.parseInt(hexString, 16);
		//Convert Decimal to Binary
		String str = Integer.toBinaryString(num);
		// Print binary
		System.out.println("Binary conversion: " + str);
	}

}
