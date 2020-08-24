package inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW obj = new BMW("Manual", "By India");
		
		System.out.println(obj.carType);
		System.out.println(obj.carMade);
		
		obj.carStarts();


	}

}
