package practiceProgrammes;

import net.bytebuddy.implementation.bytecode.Throw;

public class TestEmployee {

	public static void main(String[] args) {

		HDFC hd = new HDFC();
		hd.work();

		Employee emp = new HDFC();// dynamic polymorprism
		emp.work();
		
		TestEmployee obj = new TestEmployee();
		obj.addition();
		int a = obj.addition(30, 40);
		System.out.println(a);

	}

	public void addition() {

		int a = 20;
		int b = 30;
		int c = a + b;
		System.out.println(c);

	}

	public int addition(int x, int y) {

		int z = x + y;
		return z;
		
	}
	

}
