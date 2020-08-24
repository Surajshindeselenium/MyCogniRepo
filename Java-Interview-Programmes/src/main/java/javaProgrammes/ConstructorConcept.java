package javaProgrammes;

public class ConstructorConcept {
	
	 String firstName;
	 String lastName;
	
	public ConstructorConcept() {
		
		System.out.println("My name is Suraj Shinde");
		
	}
	
	public ConstructorConcept(String name) {
		
		System.out.println(name);
		
	}
	
	public ConstructorConcept(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

}
