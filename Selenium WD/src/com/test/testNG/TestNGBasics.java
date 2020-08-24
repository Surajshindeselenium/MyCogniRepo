package com.test.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	//Pre-Conditions Annotations: starting with @Before 
	//Every Annotation should associated with one method
	
	@BeforeSuite //Executed 1st
	public void setUp() {
		
		System.out.println("SetUp method");
		
	}
	
	@BeforeTest //Executed 2nd
	public void launchBrowser() {
		
		System.out.println("Launch Chrome Browser");
		
	}
	
	@BeforeClass//Executed 3rd
	public void login() {
		
		System.out.println("Login to App");
		
	}
	
	@BeforeMethod//Executed 4th
	public void enterURL() {
		
		System.out.println("URL entered");
		
	}
	/*
	 * Sequence will be-
	 * @BeforeMethod
	 * @Test(1)
	 * @AfterMethod
	 * 
	 * BeforeMethod
	 * @Test(2)
	 * @AfterMethod
	 */
	
	//Test Case - starting with @Test Annotation
	@Test //Executed 5th
	public void googleTitleTest() {
		
		System.out.println("Google title Verified");
		
	}
	/* while executing test it create pair of @Before - @Test -@After annotation 
	  Hence,same pair will execute with all test available */
	@Test
	public void searchTest() {
		System.out.println("Search method");
	}
	
	//Post-Conditions Annotations - Starting with @After 
	@AfterMethod//Executed 6th
	public void logout() {
		System.out.println("Logout to App");
	}
	
	@AfterTest //Executed 7th
	public void deleteAllCookies() {
		
		System.out.println("Delete All Cookies");
		
	}
	@AfterClass //Executed 8th
	public void closeBrowser() {
		
		System.out.println("Browser Closed");
		
	}
	
	@AfterSuite //Executed 9th
	public void generateTestReport() {
		
		System.out.println("Test Report generated");
		
	}
	}
