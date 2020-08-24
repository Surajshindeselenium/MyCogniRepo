package javaPracticeProgrammes;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0, b=0, c=1;
		int num=5;
		
		for(int i=0; i<=num;i++) {
			
			a=b;
			b=c;
			c=a+b;
			
			System.out.print(a+" ");
			
		}
		
		
		
	}

}
