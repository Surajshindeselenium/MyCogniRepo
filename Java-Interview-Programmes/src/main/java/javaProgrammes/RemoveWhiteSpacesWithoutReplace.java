package javaProgrammes;

public class RemoveWhiteSpacesWithoutReplace {
	
	//Write a Java Program to remove all white spaces from a string without using replace().
	public static void main(String[] args) {

		/*
		 * This is another approach to removing all the white spaces. Again, we have one
		 * string variable str1 with some value. Then, we have converted that string
		 * into a character array using toCharArray().
		 * 
		 * Then, we have one StringBuffer object sb which will be used to append the
		 * value stored at chars[i] index after we have included for loop and one if
		 * condition.
		 * 
		 * If the condition is set such that then the element at i index of the
		 * character array should not be equal to space or tab. Finally, we have printed
		 * our StringBuffer object sb.
		 * 
		 * 
		 */
		String str1 = "Suraj Shinde        is an Autom ation Engi ne      er";
		  
        char[] chars = str1.toCharArray();
  
        StringBuffer sb = new StringBuffer();
  
        for (int i = 0; i < chars.length; i++)
        {
            if( (chars[i] != ' ') && (chars[i] != '\t') )
            {
                sb.append(chars[i]);
            }
        } 
        System.out.println(sb);         
	}

}
