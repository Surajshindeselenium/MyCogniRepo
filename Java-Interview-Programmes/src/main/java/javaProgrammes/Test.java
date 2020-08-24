package javaProgrammes;

import java.util.Random;

public class Test {
	
	

	public static void main(String[] args) {
	
		
		
	String name = "Suraj Shinde";
	char[] it = name.toCharArray();
	
	
	for(int i=it.length-1;i>0;i--) {
		
		System.out.print(it[i]);
		
		
	}
	
	System.out.println(name.replace("","").length());
		
	
		Random ran = new Random();
		
		int ran_in1 = ran.nextInt(100);
		int ran_in2 = ran.nextInt(1000);
		System.out.println(ran_in1);
		System.out.println(ran_in2);
		
		String s = new String();
		 s = "Suraj1234";
		String[] part = s.split("(?<=\\D)(?=\\d)");
		System.out.println(part[0]);
		System.out.println(part[1]);
		
		


	}

}
