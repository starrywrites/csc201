// VENDING MACHINE

package csc201mod1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Mod1Problem2 {
	
	// Define function that processes yes/no questions
	// Define function that processes yes/no questions
	public static boolean answerYesNo(String question) {
		Scanner scan = new Scanner (System.in);

		String answer;
		boolean repeat = true;

		boolean yn = true;
		while(repeat)
		{
		    System.out.print(question);
		    answer = scan.nextLine();

		    switch(answer)
		    {
		        case "Y":
		            yn = true;
		            repeat = false;
		            break;

		        case "N":
		            yn = false;
		            repeat = false;
		            break;

		        default:
		            System.out.println("Invalid input. Please enter again.");
		            repeat = true;
		    }
		}
		return yn;
	}
	
	// Define function that processes snack option inputs
	public static int optInputter() {
		// Create new Scanner object, integer, and loop check
		Scanner sc = new Scanner(System.in);
		boolean isValid = false;
		int s = 1;
		
		// Prompt user for input and reject if invalid
		while (!isValid) {
			System.out.print("Please input an option: ");
			s = sc.nextInt();
			
			if (s==0 || s==1 || s==2 || s==3 || s==4 || s==5) break;
			else System.out.println("Invalid input. Please try again.");
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println("~SNACKVEND~ (OWNED BY WACKY SNACKY LTD.)");
		
		// Create Scanner object, input variables, and loop check
		Scanner input = new Scanner(System.in);
		BigDecimal moneyTotal = new BigDecimal("0.00");
		boolean isDone = false;
		
		// Set values of money, will be used for the change section as well
		BigDecimal zero =  new BigDecimal("0.00");
		BigDecimal bill5 =  new BigDecimal("5");
		BigDecimal bill1 =  new BigDecimal("1");
		BigDecimal quar =  new BigDecimal("0.25");
		BigDecimal dime =  new BigDecimal("0.10");
		BigDecimal nick =  new BigDecimal("0.05");
		BigDecimal penn =  new BigDecimal("0.01");
		
		System.out.println("Please enter currency. Accepts $[5], $[1], $[.25], $[.10], $[.05], and $[.01].");
		
		// Process currency input
		while (!isDone) {
			System.out.print("Input amount. Enter [0] when finished: ");
			BigDecimal enteredAmt = input.nextBigDecimal();
			BigDecimal cancel =  new BigDecimal("0");
			
			if (enteredAmt.equals(zero) && moneyTotal.equals(zero)) {
				System.out.println("You have not entered any money! Please input currency to proceed.");
			}
			else if (enteredAmt.equals(cancel) || enteredAmt.equals(zero)) {
				break;
			}
			else if (enteredAmt.equals(bill5) || enteredAmt.equals(bill1) || enteredAmt.equals(quar) || enteredAmt.equals(dime) || enteredAmt.equals(nick) || enteredAmt.equals(penn)) {
				moneyTotal = moneyTotal.add(enteredAmt);
				System.out.println("You entered " + enteredAmt + ". You have entered " + moneyTotal + " in total.");
			}
			else {
				System.out.println("The amount " + enteredAmt + " is not a valid input. Please input exactly 5, 1, .25, .10, .05, or .01.");
			}
		}
		
		// Display snack options to the user
		System.out.println("You have entered $" + moneyTotal + ".");
		System.out.println("HERE ARE YOUR OPTIONS:");
		System.out.println("(1) Giorgio's Nuts N' Crackers      ---   $1.50");
		System.out.println("(2) Grandma's Millhouse Biscuits    ---   $1.00");
		System.out.println("(3) Twickles                        ---   $0.65");
		System.out.println("(4) Schiller Mini Babkas            ---   $2.10");
		System.out.println("(5) Panther Pack-o-Gum              ---   $0.25");
		System.out.println("(0) ***CANCEL");
		
		// Create variables needed for snack loop
		boolean anotherOpt = true;
		int optCount = 0;
		BigDecimal purchTotal = new BigDecimal("0.00");
		BigDecimal check;
		
		//Process snack selections
		while (optCount<5) {
			// Get user selection using optInputter function (and make sure it's valid)
			int selection = optInputter();
			
			// Get selection cost
			BigDecimal selectionCost = new BigDecimal("0.00");
			if (selection==1) selectionCost = BigDecimal.valueOf(1.50);
			else if (selection==2) selectionCost = BigDecimal.valueOf(1.00);
			else if (selection==3) selectionCost = BigDecimal.valueOf(.65);
			else if (selection==4) selectionCost = BigDecimal.valueOf(2.10);
			else if (selection==5) selectionCost = BigDecimal.valueOf(.25);
			
			// Process selection
			if (selection==0) {
				System.out.println("Cancelling purchase(s)...");
				purchTotal = BigDecimal.valueOf(0.00);
				break;
			}
			else {
				check = moneyTotal.subtract(purchTotal).subtract(selectionCost);
				if (check.compareTo(BigDecimal.ZERO) <0) {
					System.out.println("You don't have enough money for that!");
				}
				else {
					System.out.println("Selected option ("+ selection +")!");
					optCount++;
					purchTotal = purchTotal.add(selectionCost);
				}
				
				anotherOpt = answerYesNo("Would you like to buy something else? (Y/N): ");
			}
			
			// Exit text if answer is no
			if (!anotherOpt) {
				System.out.println("Purchases complete! Your total is "+ purchTotal +". Vending selections... Please enjoy!");
				break;
			}
		}

		// Return Money
		BigDecimal returnChange = moneyTotal.subtract(purchTotal);
		System.out.println("Returning money... Your total change is: $" + returnChange);
		
		// Find number of quarters
		BigDecimal quarterCount = (returnChange.divide(quar)).subtract(returnChange.remainder(quar));
		quarterCount = quarterCount.setScale(0, RoundingMode.DOWN);
		returnChange = returnChange.subtract(quarterCount.multiply(quar));

		// Find number of dimes
		BigDecimal dimeCount = (returnChange.divide(dime)).subtract(returnChange.remainder(dime));
		dimeCount = dimeCount.setScale(0, RoundingMode.DOWN);
		returnChange = returnChange.subtract(dimeCount.multiply(dime));
		
		// Find number of nickles
		BigDecimal nickleCount = (returnChange.divide(nick)).subtract(returnChange.remainder(nick));
		nickleCount = nickleCount.setScale(0, RoundingMode.DOWN);
		returnChange = returnChange.subtract(nickleCount.multiply(nick));	

		// Find number of pennies
		BigDecimal pennyCount = (returnChange.divide(penn)).subtract(returnChange.remainder(penn));
		pennyCount = pennyCount.setScale(0, RoundingMode.DOWN);
		returnChange = returnChange.subtract(pennyCount.multiply(penn));
		
		System.out.println(quarterCount + " quarter(s)...");
		System.out.println(dimeCount + " dime(s)...");
		System.out.println(nickleCount + " nickle(s)...");
		System.out.println(pennyCount + " pennies...");
	}
}
