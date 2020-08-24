package javaProgrammes;

public class FinalReverseWithoutUsingStringMethods {

	// Write a Java Program to reverse a string without using String inbuilt
	// function.

	public static void main(String[] args) {

		/*
		 * The object of the string builder class str2 will be further used to append
		 * the value stored in the string variable str. Thereafter, we are using the
		 * inbuilt function of the string builder (reverse()) and storing the new
		 * reversed string in str2. Finally, we are printing str2.
		 */

		String str = "Suraj Shinde";
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		System.out.println(str2);
		str2 = str2.reverse(); // used string builder to reverse
		System.out.println(str2);
		
		StringBuffer strng = new StringBuffer(str);
		strng.reverse();
		System.out.println(strng);

	}

}
