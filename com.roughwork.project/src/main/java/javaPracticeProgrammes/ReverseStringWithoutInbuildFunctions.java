package javaPracticeProgrammes;

public class ReverseStringWithoutInbuildFunctions {

	public static void main(String[] args) {
		
		String str = "Suraj Shinde";
		char [] ar = str.toCharArray();
		System.out.println(ar.length);
		for(int i=ar.length-1;i>=0;i--) {
			
			System.out.print(ar[i]);
			
		}

	}

}
