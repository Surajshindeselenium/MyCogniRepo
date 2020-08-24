package javaPracticeProgrammes;
public class ReplaceCharsWithStar {

	public static void main(String[] args) {
		
		String str = "Let's meet l8r 2nite?";
		
		replaceWords(str);

	}
	
	public static void replaceWords(String str) {
		//"*'* * *8* 2*?"
		String newString="";
		char [] c =str.toCharArray();
		
		for(int i=0; i<c.length;i++) {
			
			if(!Character.isDigit(i)) {
				
				 newString =str.replace(c[i], '*');
				
			}
		}
		
		System.out.println(newString);
	}

}
