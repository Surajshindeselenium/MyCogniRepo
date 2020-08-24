package javaProgrammes;

import java.util.Scanner;

public class SwapTwoNumberWithoutThirdVariable {

	// Write a Java Program to swap two numbers without using the third variable.
	public static void main(String[] args) {

		/*
		 * Here, we are assigning x with the value x + y which means x will have a sum
		 * of both x and y.
		 * 
		 * Then, we are assigning y with the value x – y which means we are subtracting
		 * the value of y from the sum of (x + y). Till here, x still has the sum of
		 * both x and y. But y has the value of x.
		 * 
		 * Finally, in the third step, we are assigning x with the value x – y which
		 * means we are subtracting y (which has the value of x) from the total (x + y).
		 * This will assign x with the value of y and vice versa.
		 */
		
		 int x, y;
	      System.out.println("Enter x and y");
	      Scanner in = new Scanner(System.in);
	  
	      x = in.nextInt();//5
	      y = in.nextInt();//7
	  
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	  
	      x = x + y;//12
	      y = x - y;//5
	      x = x - y;//7
	  
	      System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);

	}

}
