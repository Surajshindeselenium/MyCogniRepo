package javaProgrammes;

public class RemoveWhiteSpacesFromString {

	// Write a Java Program to remove all white spaces from a string with using
	// replace().
	public static void main(String[] args) {

		/*
		 * This is a simple program where we have our string variable str1.
		 * 
		 * Another string variable str2 is initialized with the replaceAll option which
		 * is an inbuilt method to remove n number of whitespaces. Ultimately, we have
		 * printed str2 which has no whitespaces.
		 * 
		 * 
		 */
		
		 String str1 = "Suraj Shinde        is a QualityAna    list";
		  
	        //1. Using replaceAll() Method
	  
	        String str2 = str1.replaceAll("\\s","");
	  
	        System.out.println(str2);
	  

	}

}
