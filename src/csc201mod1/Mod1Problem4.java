// COMPLEX NUMBERS

package csc201mod1;

import java.util.Scanner;

public class Mod1Problem4 {
	public static String addComplex(float a1, float b1, float a2, float b2) {
		String z = "[z1 + z2 = "+(a1+a2)+" + i*"+(b1+b2)+"]";
		return z;
	}
	public static String subComplex(float a1, float b1, float a2, float b2) {
		String z = "[z1 - z2 ="+(a1-a2)+" + i*"+(b1-b2)+"]";
		return z;
	}
	public static String multComplex(float a1, float b1, float a2, float b2) {
		String z = "[z1 * z2 ="+(a1*a2-b1*b2)+" + i*"+(a1*b2 + b1*a2)+"]";
		return z;
	}
	public static String divComplex(float a1, float b1, float a2, float b2) {
		String z = "[z1 / z2 = "+(a1*a2 +b1*b2)/(Math.pow(a2, 2) + Math.pow(b2, 2))+" + i*"+(b1*a2-a1*b2)/(Math.pow(a2, 2) + Math.pow(b2, 2))+"]";
		return z;
	}
	
	public static void main(String[] args) {
		// Create Scanner object and input variable
		Scanner input = new Scanner(System.in);
		
		System.out.println("Let's do some operations on two Complex Numbers.");
		System.out.print("Please provide the real part of the first Complex Number: ");
		float inputA1 = input.nextFloat();
		System.out.print("Please provide the imaginary part of the first Complex Number: ");
		float inputB1 = input.nextFloat();
		System.out.print("Please provide the real part of the second Complex Number: ");
		float inputA2 = input.nextFloat();
		System.out.print("Please provide the imaginary part of the second Complex Number: ");
		float inputB2 = input.nextFloat();
		
		String resultAdd = addComplex(inputA1, inputB1, inputA2, inputB2);
		System.out.println("Addition operation result " + resultAdd);
		String resultSub = subComplex(inputA1, inputB1, inputA2, inputB2);
		System.out.println("Subtraction operation result " + resultSub);
		String resultMult = multComplex(inputA1, inputB1, inputA2, inputB2);
		System.out.println("Multiplication operation result " + resultMult);
		String resultDiv = divComplex(inputA1, inputB1, inputA2, inputB2);
		System.out.println("Division operation result " + resultDiv);
		
		input.close();
	}

}
