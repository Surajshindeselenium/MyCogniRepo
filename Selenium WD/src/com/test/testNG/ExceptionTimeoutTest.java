package com.test.testNG;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
	
	@Test(timeOut=2000)
	public void infinite() {
		int i = 1;
		
		while(i==1) {
			
			System.out.println(i);
			
		}
	}

}
