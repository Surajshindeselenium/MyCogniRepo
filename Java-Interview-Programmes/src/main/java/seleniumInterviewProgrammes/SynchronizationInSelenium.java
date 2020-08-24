package seleniumInterviewProgrammes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Photon WorkSpace\\\\Java-Interview-Programmes\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// all implicitly/explicit wait are dynamic. e.g if page is loaded in 2 seconds
		// then rest of 18 sec will ingnored
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// wait to load page for 20 sec
		// implicitly wait--is applied globally--is available for all web elements
		// implicit wait is directly applied on driver
		//dynamic in nature 
		//it can be changed anywhere and any time 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement signUp = driver.findElement(By.id("u_0_13"));
		sendKeys(driver, firstname, 10, "Suraj");
		sendKeys(driver, lastname, 10, "Shinde");
		clickOn(driver, signUp, 10);
		

	}
	//Explicit wait:
	//1. No Explicit keyword or method  
	//2. available with WebDriverWait with some expected condition 
	//3. It is specific to element
	//4. Dynamic in nature 
	//5. We should never use implicitly and explicit wait together because unnecessarily total sych wait time will increased 
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	public static void clickOn(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
