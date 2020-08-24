package javaPracticeProgrammes;

public class DuplicteCharachtersInString {

	public static void main(String[] args) {
		
		String str = "testing the test";
		
		char [] chars = str.toCharArray();
		
		for(int i=0; i<chars.length; i++) {
			
			for(int j=i+1; j<chars.length;j++) {
				
				if(chars[j]==chars[i]) {
					System.out.print(chars[j]);
				}
				
			}
		}

	}

}
