package javaProgrammes;

import java.util.Scanner;

public class PrimeOrNot {

	// Write a Java Program to find whether a number is prime or not
	public static void main(String[] args) {

		/*
		 * Here, we have declared two integers temp and num and used Scanner class with
		 * nextInt(as we have integer only).
		 * 
		 * One boolean variable isPrime is set to true. Thereafter, we have used for
		 * loop starting from 2, less than half of the number is entered and incremented
		 * by 1 for each iteration. Temp will have the remainder for every iteration. If
		 * the remainder is 0, then isPrime will be set to False.
		 * 
		 * Based on isPrime value, we are coming to the conclusion that whether our
		 * number is prime or not.
		 */
		
		int temp, num;
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();
        for (int i = 2; i<= num/2; i++) {
            temp = num%i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) 
            System.out.println(num + "number is prime");
            else
                System.out.println(num + "number is not a prime");
             
         
    }

	

}
