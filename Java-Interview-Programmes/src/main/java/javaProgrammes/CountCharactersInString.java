package javaProgrammes;

public class CountCharactersInString {

	public static void main(String[] args) {

		String str = "I am Suraj Shinde";
		int count =0;
		
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) !=' ') {
				count ++;
			}
		}
		
		System.out.println("Total no of Character are: "+count);
		
		
		
		
	}

}
