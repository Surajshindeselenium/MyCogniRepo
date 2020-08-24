package javaPracticeProgrammes;

public class TestAbstract extends AbstractConcept {

	public static void main(String[] args) {
		AbstractConcept obj =new TestAbstract();
		obj.abstractMethod();
		obj.myMethod();
	}

	@Override
	public void abstractMethod() {
		
		System.out.println("my abstractMethod body");
		
	}

}
