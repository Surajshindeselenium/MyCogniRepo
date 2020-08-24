package javaProgrammes;

import java.util.Scanner;

public class FibonacciSeries {

	// Write a Java Program for the Fibonacci series
	public static void main(String[] args) {

		/*
		 * Fibonacci series is a series of numbers where after the initial two numbers,
		 * every occurring number is the sum of two preceding numbers.
		 * 
		 * For Example 0,1,1,2,3,5,8,13,21………
		 * 
		 * In this program, we have used Scanner class again with nextInt (discussed
		 * above). Initially, we are entering (through command line) the number of times
		 * the Fibonacci has to iterate. We have declared integer num and initialized
		 * a,b with zero and c with one. Then, we have used for loop to iterate.
		 * 
		 * The logic goes like a is set with the value of b which is 0, then b is set
		 * with the value of c which is 1. Then, c is set with the sum of both a and b.
		 */

		int num, a = 0, b = 0, c = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of times");
		num = in.nextInt();
		System.out.println("Fibonacci Series of the number is:");
		for (int i = 0; i <= num; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + ""); // if you want to print on the same line, use print()
		}
	
	}

}
