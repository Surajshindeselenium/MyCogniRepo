
public class ThrowsKeyword {

	public static void main(String[] args) {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sample();
		System.out.println("***");//this line will not print as exception throwing on line no 7 and programe will terminate after that
		//if you don't want to terminate your programe then exception line should be handled with catch block
	}
	
	public void sample()  {
		div();
	}
	public void div() throws ArithmeticException   {
	
			int i=9/0;
		
		
		
	}
	
}
