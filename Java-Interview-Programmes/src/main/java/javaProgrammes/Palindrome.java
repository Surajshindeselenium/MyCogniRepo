package javaProgrammes;

import java.util.Scanner;

public class Palindrome {

	// Write a Java Program to find whether a string or number is palindrome or not
	public static void main(String[] args) {

		/*
		 * You can use any of the reverse string program explained above to check
		 * whether the number or string is palindrome or not.
		 * 
		 * What you need to do is to include one if-else statement. If the original
		 * string is equal to a reversed string then the number is a palindrome,
		 * otherwise not.
		 */
		
		String original, reverse = "";
		int length;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number or String");
        original = in.nextLine();
        length = original.length();
        System.out.println(length);
        for (int i =length -1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("reverse is:" +reverse);
         
        if(original.equals(reverse)) 
            System.out.println("The number/string is palindrome");
        else
            System.out.println("The number/string is not a palindrome");
		
	}
	

	

}
