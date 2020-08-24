package com.testNG.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"browser","url", "email"})
	public void yahooLoginTest(String browser,String url, String email) {
		
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Photon WorkSpace\\\\Selenium WD\\\\ChromeDriver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		} else if (browser.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver","");
			driver = new FirefoxDriver();
			
		}
		driver.get("url");
		driver.findElement(By.id("login-username")).sendKeys("email");
		driver.findElement(By.id("login-signin")).click();
		
	}

}
