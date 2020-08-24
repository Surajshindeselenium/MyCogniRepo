package letsKodeWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		driver.findElement(By.id("name")).sendKeys("Suraj");
		driver.findElement(By.id("alertbtn")).click();
		
		
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Assert.assertEquals(alertMessage, "Hello Suraj, share this practice page and share your knowledge");
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		driver.quit();

	}

}
