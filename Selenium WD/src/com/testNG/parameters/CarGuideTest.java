package com.testNG.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CarGuideTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Photon WorkSpace\\Selenium WD\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();//launching chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://secure.carsguide.com.au/login?state=g6Fo2SBaaUw3bHR0U0wyUnNXM3ZiZFY4b2xELUlNYlI3MTQ3ZKN0aWTZIFFRVWdiVDdZbXM5MkRCV25MRFJqZkVSLXJjdUhtZ1NS"
				+ "o2NpZNkgeWlGUnY5NlVSc2NaQVpsWEJhaVNLZG9IOW1zUm9oUTU&client=yiFRv96URscZAZlXBaiSKdoH9msRohQ5&protocol=oauth2&response_type=token%20id_token&redire"
				+ "ct_uri=https%3A%2F%2Fwww.carsguide.com.au%2Fbuy-a-car%2Fauth&scope=openid%20profile%20email%20user_metadata&audience=platform.autotrader.com.au&screen"
				+ "=signUp&nonce=SSGc350cZbxi6ymR5EzyFpDXUmZBjnI7&auth0Client=eyJuYW1lIjoiYXV0aDAuanMiLCJ2ZXJzaW9uIjoiOS4xMC40In0%3D");
		
	}
	
	@DataProvider
	public void getTestData() {
		
	}
	
	@Test
	public void loginTest(String email, String password, String firstName, String lastName) {
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='given_name']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name='family_name']")).sendKeys(lastName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
