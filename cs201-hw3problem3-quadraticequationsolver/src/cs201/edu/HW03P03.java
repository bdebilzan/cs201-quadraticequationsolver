package cs201.edu;

/*
Bryce DeBilzan
HOMEWORK 3 PROBLEM 3- "Quadratic Equation Solver"
Prompts user to enter values for a, b, and c and displays result based on
discriminant. If discriminant is positive, displays two roots. 
If the discriminant is 0, displays one root.
Otherwise, displays "The equation has no real roots".
*/

import java.util.Scanner;

public class HW03P03{
	public static void main(String[] args) {
		//Creates Scanner object
		Scanner in = new Scanner(System.in);
		
		//Asks user for three numbers
		System.out.println("Enter a, b, c: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		
		//Calculates discriminant
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		
		//Calculates roots
		double root1 = ((-1.0 * b) + (Math.sqrt(b * b - 4 * a * c))) / (2 * a);
		double root2 = ((-1.0 * b) - (Math.sqrt(b * b - 4 * a * c))) / (2 * a);
		
		//Determines if discriminant is positive and calculates/displays two roots if so
		if (discriminant > 0)
			{
				System.out.println("The roots are");
				System.out.println(root1 + " and " + root2);
			}	
		//Determines if discriminant is negative and displays that it has no roots if so
		else if (discriminant < 0)
			{
				System.out.println("The equation has no real roots.");
			}
		//Displays one root for discriminants that are 0	
		else 
			{
				System.out.println("The root is " + root1);
			}	
		}
	}