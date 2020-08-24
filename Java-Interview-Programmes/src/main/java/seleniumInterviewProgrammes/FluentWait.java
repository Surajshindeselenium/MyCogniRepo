package seleniumInterviewProgrammes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize window 
		driver.manage().deleteAllCookies();//to delete all cookies

		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/show/");
		driver.findElement(By.id("button")).click();
		
//		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
//			       .withTimeout(30, TimeUnit.SECONDS)
//			       .pollingEvery(5, TimeUnit.SECONDS)
//			       .ignoring(NoSuchElementException.class);
//
//			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//			     public WebElement apply(WebDriver driver) {
//			       return driver.findElement(By.id("foo"));
//			     }
//			   });

	}

}
