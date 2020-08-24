package javaProgrammes;

public class TestAbstract extends AddtionClass {

	public static void main(String[] args) {
		
		
		TestAbstract obj = new TestAbstract();
		obj.addition();
		int p =obj.substraction();
		System.out.println(p);
		
		

	}

	@Override
	public void addition() {
		
		int a = 10;
		int b=20;
		int c = a+b;
		System.out.println(c);
		
		
		
	}

}
