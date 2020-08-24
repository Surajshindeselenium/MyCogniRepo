/**
 * 
 */
package com.MyTest.Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.my.pages.BasePage;
import pom.my.pages.Page;

/**
 * @author 348333
 *
 */
public class BaseTest {

	WebDriver driver;

	public Page page;

	@BeforeMethod
	@Parameters(value = { "browser" })
	public void setUp(String browser) {

		if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		else if (browser.equals("Firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			System.out.println("No browser defined in xml file");
		}
		
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		page = new BasePage(driver);

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
