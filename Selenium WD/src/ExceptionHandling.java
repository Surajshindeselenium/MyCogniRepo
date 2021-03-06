
public class ExceptionHandling {
	
	int a=10;

	public static void main(String[] args) {
		
		//un caught exception, because it not detect at compile time 
		//How to handle exception
		//1. try...catch block
		try {
		      
		int i = 9/0;//this code will throw an exception
		
		}
		catch(ArithmeticException e){
			
			System.out.println("In catch block");
			e.printStackTrace();			
		}
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		
		//Caught exception
		try {
			Thread.sleep(3000);//it will give you warning to handle exception at compile time
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ExceptionHandling obj = new ExceptionHandling();
		obj = null;
		System.out.println(obj);
		
	}

}
