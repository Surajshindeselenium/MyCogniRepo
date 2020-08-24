package javaPracticeProgrammes;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		String original;
		Scanner in = new Scanner(System.in);
        System.out.println("Enter the number or String");
        original = in.nextLine();
   
        StringBuffer sb = new StringBuffer(original);
        StringBuffer string = sb.reverse();
        System.out.println(string);
        String str = new String(string);
        
        if(original.equals(str)) {
        	System.out.println("number/string is palindorm");
        }
        else {
        	System.out.println("not palindrom");
        }

	}

}
