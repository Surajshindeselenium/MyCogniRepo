package seleniumInterviewProgrammes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	// Write a Java Program to demonstrate Scroll up/ Scroll down.
	public static void main(String[] args) {

		/*
		 * In this program, we have included our JavascriptExecutor js which will do the
		 * scrolling. If you see the last line of the code, we have passed
		 * window.scrollBy(arg1,arg2).
		 * 
		 * If you want to scroll up then pass some value in arg1 if you want to scroll
		 * down then pass some value in arg2.
		 * 
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Photon WorkSpace\\\\Java-Interview-Programmes\\\\ChromeDriver\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("SoftwareTestingHelp");
        element.sendKeys(Keys.ENTER);
        js.executeScript("window.scrollBy(0,1000)");
        
        driver.quit();
	}

}
