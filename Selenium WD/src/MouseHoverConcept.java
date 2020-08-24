import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverConcept extends ChromeProperties {

	public static void main(String[] args) {
		
		MouseHoverConcept obj = new MouseHoverConcept();
		obj.chromeLaunch();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize window 
		driver.manage().deleteAllCookies();//to delete all cookies

		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		action.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		driver.findElement(By.linkText("Sign up")).click();
		
		


	}

}
