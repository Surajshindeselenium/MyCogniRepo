
public class ThrowKeyword {

	public static void main(String[] args) {
		
		//Difference between Throw and Throws Keyword
		//Throw keyword used to throw an exception deliberately whereas Throws keyword used to catch handle exception
		
		System.out.println("Suraj");
		
		try {
			throw new Exception("Suraj Exception");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("Shinde");
		
		String Exe_Flag = "N";
		if(Exe_Flag.equals("N")) {
			
			try {
				throw new Exception("Execution flag is blank exception");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
		}
		
		
		
	
}
