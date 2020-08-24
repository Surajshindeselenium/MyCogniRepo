package javaProgrammes;

public class DuplicateCharactersInString {

	// Write a Java Program to find the duplicate characters in a string.
	public static void main(String[] args) {

		/*
		 * In this program, we have created a string variable str and initialized an
		 * integer count with zero.
		 * 
		 * Then, we have created a character array to convert our string variable to the
		 * character. With the help of for loop, we are performing a comparison between
		 * different characters at different indexes.
		 * 
		 * If two characters of consecutive index match, then it will print that
		 * character and the counter will be incremented by 1 after each iteration.
		 * 
		 * 
		 */
		String str = new String("Surrajj");
		int count = 0;
		char[] chars = str.toCharArray();
		System.out.println("Duplicate characters are:");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (chars[i] == chars[j]) {
					System.out.print(chars[j]);
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
	}

}
