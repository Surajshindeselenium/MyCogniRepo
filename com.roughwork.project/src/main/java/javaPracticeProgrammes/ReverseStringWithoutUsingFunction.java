package javaPracticeProgrammes;

public class ReverseStringWithoutUsingFunction {

	public static void main(String[] args) {
		
		String str = "Software Testing";
		
		char [] chars=  str.toCharArray();
		
		System.out.println(chars.length);
		
		for(int i=chars.length-1;i>=0;i-- ) {
			
			System.out.println(chars[i]);
			
		}
		
		
	}

}
