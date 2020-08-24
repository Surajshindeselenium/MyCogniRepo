package javaPracticeProgrammes;

public class ReverseEachWordInString {

	public static void main(String[] args) {

		String str = "Hi I am Suraj Shinde and I live in Pune wakad";
		
		//reverse each word in string 
		String[] str1 = str.split(" ");
		
		for(int p=str1.length-1; p>=0; p--) {
			
			System.out.print(str1[p]+" ");
			
			
		}
		System.out.println("\n");
		//reverse each character in string using StringBuffer
		System.out.println("reverse each character in string using StringBuffer");
		StringBuffer stb = new StringBuffer(str);
		stb.reverse();
		System.out.println(stb);
		
		//reverse each character in string without using StringBuffer
		System.out.println("reverse each character in string without using StringBuffer");
		char [] reverseString = str.toCharArray();
		
		for(int i=reverseString.length-1; i>=0; i--) {
			
			System.out.print(reverseString[i]);
			
		}
		

	}

}
