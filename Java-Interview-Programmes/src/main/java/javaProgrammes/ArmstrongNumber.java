package javaProgrammes;

public class ArmstrongNumber {

	// Write a Java Program to check Armstrong number.
	public static void main(String[] args) {

		/*
		 * First of all we need to understand what Armstrong Number is. Armstrong number
		 * is the number which is the sum of the cubes of all its unit, tens and hundred
		 * digits for three-digit numbers.
		 * 
		 * 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
		 * 
		 * If you have a four-digit number lets say
		 * 
		 * 1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1 + 1296 + 81 + 256 = 1634
		 * 
		 * Now, in this program, we have a temp and integers declared. We have
		 * initialized c with value 0. Then, we need to assign the integer value which
		 * we are going to check for Armstrong (in our case, let us say 153). Then we
		 * have assigned our temp variable with that number which we are going to check.
		 * 
		 * Thereafter, we have used while conditional check where the remainder is
		 * assigned to a and the number is divided by 10 and assigned to n. Now, our c
		 * variable which was set to zero initially is assigned with c+(a*a*a). Suppose
		 * we have to evaluate a four-digit number then c should be assigned with c +
		 * (a*a*a*a).
		 * 
		 * Lastly, we have put an if-else statement for conditional checking where we
		 * have compared the value contained in c against temp(which has the actual
		 * number stored at this point). If it matches, then the number is Armstrong
		 * otherwise not.
		 */

		int c = 0, a, temp;
		int n = 153;// It is the number to check Armstrong
		temp = n;
		while (n > 0) {
			a = n % 10;//5.3
			n = n / 10;//1.53
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");
	}

}
