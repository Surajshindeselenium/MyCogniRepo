package javaProgrammes;

public class LeftTriangleStarPattern {
	
	 
	
	public static void leftTriangleStarPattern(int row) {
		
		
		
		for(int i=0; i<row; i++)   
		{   
			for(int j=0; j<=i; j++)   
			{   
				System.out.print("* ");   
			}   
				System.out.println();
		}
		
	}
	

	public static void main(String[] args) {
		
		int row=4;
		
		leftTriangleStarPattern(row);
		
	}
		
		

	

}
