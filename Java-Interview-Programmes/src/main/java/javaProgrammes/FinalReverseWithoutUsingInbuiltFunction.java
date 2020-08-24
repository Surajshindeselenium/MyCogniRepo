package javaProgrammes;

public class FinalReverseWithoutUsingInbuiltFunction {

	// Write a Java Program to reverse a string without using String inbuilt
	// function reverse().

	public static void main(String[] args) {

		/*
		 * Method 1:
		 * 
		 * In this method, we are initializing a string variable called str with the
		 * value of your given string. Then, we are converting that string into a
		 * character array with the toCharArray() function. Thereafter, we are using for
		 * loop to iterate between each character in reverse order and printing each
		 * character.
		 */

		String str = "Suraj Shinde";
		char [] chars = str.toCharArray(); // converted to character array and printed in reverse order
		System.out.println(chars.length);
		for (int i = chars.length-1; i >= 0; i--) {

			System.out.print(chars[i]);
		}

	}

}
