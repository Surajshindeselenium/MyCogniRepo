package javaProgrammes;

import java.util.Scanner;

public class SwapTwoNumbersUsingThirdVariable {

	// Write a Java Program to swap two numbers using the third variable
	public static void main(String[] args) {

		/*
		 * In this example, we have made use of the Scanner class to declare an object
		 * with a predefined standard input object. This program will accept the values
		 * of x and y through the command line (when executed).
		 * 
		 * We have used nextInt() which will input the value of an integer variable ‘x'
		 * and ‘y' from the user. A temp variable is also declared.
		 * 
		 * Now, the logic of the program goes like this – we are assigning temp or third
		 * variable with the value of x, and then assigning x with the value of y and
		 * again assigning y with the value of temp. So, after the first complete
		 * iteration, the temp will have a value of x, x will have a value of y and y
		 * will have a value of temp (which is x).
		 */
		int x, y, temp;
		System.out.println("Enter x and y");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		System.out.println("Before Swapping" + x + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping" + x + y);

	}

}
