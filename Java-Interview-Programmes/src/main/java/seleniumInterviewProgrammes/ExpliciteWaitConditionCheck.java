package seleniumInterviewProgrammes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Write a Java Program to demonstrate an explicit wait condition check
public class ExpliciteWaitConditionCheck {

	/*
	 * There are two main types of wait – implicit and explicit. (We are not
	 * considering Fluent wait in this program)
	 * 
	 * The implicit wait is those waits that are executed irrespective of any
	 * condition. In the below program, you can see that it is for Google Chrome and
	 * we have used some inbuilt methods to set the property, maximizing window, URL
	 * navigation, and web element locating.
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement element2 =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
	 * partialLinkText("Software testing - Wikipedia"))); element2.click(); In the
	 * above piece of code, you can see that we have created an object wait for
	 * WebDriverWait and then we have searched for WebElement called element2.
	 * 
	 * The condition is set in such a way that the webdriver will have to wait until
	 * we see the link “Software testing – Wikipedia” on a web page. It won't
	 * execute if it does not find this link. If it does, then it will do a mouse
	 * click on that link.
	 */

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Photon WorkSpace\\Java-Interview-Programmes\\ChromeDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-arguments");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebElement string = driver.findElement(By.xpath("//input[@name='q']"));
		string.sendKeys("Flipkart");
		string.submit();

		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='LC20lb DKV0Md'][1]")));
		element.click();

		driver.quit();
	}

}
