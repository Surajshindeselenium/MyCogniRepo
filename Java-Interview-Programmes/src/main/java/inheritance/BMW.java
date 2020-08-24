package inheritance;

public class BMW extends Car {
	
	

	public BMW(String carType, String carMade) {
		
		super(carType, carMade);
		
		
	}

	public void carStarts() {
		
		
		System.out.println("BMW Starts");
		super.carStarts();

	}
	
	public void bmwAutoStart() {

		System.out.println("BMW Auto Starts");
		

	}
	
	



}
