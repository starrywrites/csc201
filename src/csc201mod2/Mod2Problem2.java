// @author Peyton Starr
// @unit Module 2
// @assignment Programming Problems
// @problem DIVING

package csc201mod2;

import java.util.Scanner;

public class Mod2Problem2 {
	
	public static float inputValidDegreeOfDifficulty(String prompt) {
		// Create Scanner object
		Scanner scan = new Scanner (System.in);
		
		// Set loop check and return variable
		boolean isValid = false;
		float x = 0;
		
		// Loop that contains prompt, if invalid input entered, forces user to input again
		while (!isValid) {
			System.out.print(prompt);
			x = scan.nextFloat();
			if (x < 1.2 || x > 3.8) {
				System.out.println("Invalid input. Please try again.");
			}
			else break;
		}
		
		// Return judge score
		return x;	
	}
	
	public static float inputValidScore(String prompt) {
		// Create Scanner object
		Scanner input = new Scanner (System.in);
		
		// Set loop check and return variable
		boolean isValid = false;
		float x = 0;
		
		// Loop that contains prompt, if invalid input entered, forces user to input again
		while (!isValid) {
			System.out.print(prompt);
			x = input.nextFloat();
			if (x < 0 || x > 10) {
				System.out.println("Invalid input. Please try again.");
			}
			else break;
		}
		
		// Return judge score
		return x;	
	}
	
	public static float[] inputAllScores() {
		// Create score array
		float[] allScores = new float[7];
		
		// Feed values into score array using the inputValidScore function
		
		for (int i = 0; i < 7; i++) {
			allScores[i] = inputValidScore("Input Judge#"+ (i+1) +" Score: ");
		}
		
		// Return array of judge scores
		return allScores;
	}
	
	public static float calculateScore(float d, float[] s) {	
		// Sort the array... using Array class would make this easier but I can't :(((
		for (int i = 0; i < s.length-1; i++) {
			//Find minimum in the array
			float currMin =s[i];
			int currMinIndex = i;
			
			for (int j = i + 1; j < s.length; j++) {
				if (currMin > s[j]) {
					currMin = s[j];
					currMinIndex = j;
				}
			}
			if (currMinIndex != i) {
				s[currMinIndex] = s[i];
				s[i] = currMin;
			}
		}
		
		// Calculate the score
		float z = (s[1] + s[2] + s[3] + s[4] + s[5]) * d * (float) 0.6;
		
		// Return score
		return z;
	}	
	
	public static void main(String[] args) {
		// Welcome text
		System.out.println("WELCOME TO DANK DIVERS'S DI-ANNUAL COMPETITION!");
		System.out.println("Let's have our diver.... and... there they go! What a dive!");
		System.out.println("Let's see what our judges say about that...");
		
		// Get score array, difficulty, and score variables
		float difficulty = inputValidDegreeOfDifficulty("Input degree of difficulty: ");
		float[] judgeScores = inputAllScores();
		float score = calculateScore(difficulty, judgeScores);
		
		System.out.println("FINAL SCORE: " + score);
	}
}
