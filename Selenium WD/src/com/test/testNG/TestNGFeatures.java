package com.test.testNG;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginPageTest() {
		
		System.out.println("Login page");
		
	}
	
	@Test(dependsOnMethods="loginPageTest")
	public void homePageTest() {
		
		System.out.println("homePageTest");
		
	}
	
	@Test(dependsOnMethods="loginPageTest")
	public void searchPageTest() {
		
		System.out.println("searchPageTest");
		
	}

}
