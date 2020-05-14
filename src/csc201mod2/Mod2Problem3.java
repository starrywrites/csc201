// @author Peyton Starr
// @unit Module 2
// @assignment Programming Problems
// @problem TEMPERATURES

package csc201mod2;

import java.util.Scanner;

public class Mod2Problem3 {
	
	public static void inputTempforMonth(int monthIndex, int[][] temps) {
		// Create Scanner object to read input
		Scanner input = new Scanner (System.in);
		
		// Create a String array for the month labels and set current label
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String currentMonth = months[monthIndex];
		
		// Create loop check
		boolean isValid = false;
		
		// Prompt for High input, then set value to temps array
		System.out.print("Please input the High for " + currentMonth + ": ");
		int h = input.nextInt();
		temps[0][monthIndex] = h;
		
		// Prompt for Low input, then set value to temps array
		System.out.print("Please input the Low for " + currentMonth + ": ");
		int l = input.nextInt();
		temps[1][monthIndex] = l;
	}
	
	public static int[][] inputTempforYear() {
		// Create the year of Temps array. First row will be the high temp, second the low temp.
		int[][] y = new int[2][12];
		
		// Create for loop to call inputTempForMonth and alter temp Array for each month
		for (int i = 0; i < 12; i++) {
			inputTempforMonth(i, y);
		}
		
		return y;
	}
	
	public static int calculateAverageHigh(int[][] temps) {
		// Create variable for average high
		int avgHigh = 0;
		
		// Loop through all high temperatures for the year to get total of all high temperatures
		for (int i = 0; i < 12; i++) avgHigh = avgHigh + temps[0][i];
		
		// Divide total of all temps by 12 to get average high
		avgHigh = avgHigh/12;
		
		// Return result
		return avgHigh;
	}
	
	public static int calculateAverageLow(int[][] temps) {
		// Create variable for average high
		int avgLow = 0;
		
		// Loop through all high temperatures for the year to get total of all high temperatures
		for (int i = 0; i < 12; i++) avgLow = avgLow + temps[1][i];
		
		// Divide total of all temps by 12 to get average high
		avgLow = avgLow/12;
		
		// Return result
		return avgLow;
	}
	
	public static int findHighestTemp(int[][] temps) {
		// Create varisbles for high index and and current temperature maximum
		int highColumn = 0;
		int currMax = temps[0][0];
		
		// Execute for-loop which searches array for highest number in array
		for (int i = 1; i < 12; i++) {
			if (temps[0][i] > currMax) {
				currMax = temps[0][i];
				highColumn = i;
			}
			else;
		}
		
		//Return result
		return highColumn;
	}
	
	public static int findLowestTemp(int[][] temps) {
		// Create varisbles for high index and and current temperature minimum
		int lowColumn = 0;
		int currMin = temps[1][0];
		
		// Execute for-loop which searches array for lowest number in array
		for (int i = 1; i < 12; i++) {
			if (temps[1][i] < currMin) {
				currMin = temps[1][i];
				lowColumn = i;
			}
			else;
		}
		
		//Return result
		return lowColumn;
	}
	
	public static void main(String[] args) {
		// Call method that will get a 2-dimensional array with high and low temps for the year
		int [][] tempsOfTheYear = inputTempforYear();
		
		// Create a String array for the month labels
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};		
		
		// Call method to get the average of high temperatures then print it
		int averageHigh = calculateAverageHigh(tempsOfTheYear);
		System.out.println("The average High was " + averageHigh + " degrees!");
		
		// Call method to get the average of low temperatures then print it
		int averageLow = calculateAverageLow(tempsOfTheYear);
		System.out.println("The average Low was " + averageLow + " degrees!");
		
		// Call method to get the index of the month that had the highest temperature then print the month and the temperature
		int highMonth = findHighestTemp(tempsOfTheYear);
		System.out.println("The highest temperature of the year was in " + months[highMonth] + " at " + tempsOfTheYear[0][highMonth] + " degrees!");
		
		// Call method to get the index of the month that had the lowest temperature then print the month and the temperature
		int lowMonth = findLowestTemp(tempsOfTheYear);
		System.out.println("The lowest temperature of the year was in " + months[lowMonth] + " at " + tempsOfTheYear[1][lowMonth] + " degrees!");
	}
}
