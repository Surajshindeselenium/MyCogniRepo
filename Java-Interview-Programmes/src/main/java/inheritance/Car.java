package inheritance;

  public class Car {

	public String carType;
	public String carMade;
	
	public Car(String carType, String carMade) {
		
		this.carType = carType;
		this.carMade = carMade;
		
		
		
	}

	public void carStarts() {

		System.out.println("Car Starts");

	}

	public void carRefuel() {
		
		System.out.println("Car refuel");
		
	}

}
