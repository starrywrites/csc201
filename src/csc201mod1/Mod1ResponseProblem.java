package csc201mod1;

public class Mod1ResponseProblem {
	public static void main(String[] args) {		
		// Create count variable
		int count = 0;
		
		System.out.println("Kilograms    Pounds");
		while (++count < 200) {
			System.out.print(count);
			System.out.printf("            %.2f %n",count*2.2);
		}
	}
}
