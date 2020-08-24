import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement extends ChromeProperties {

	public static void main(String[] args) throws InterruptedException {
		
		MouseMovement obj = new MouseMovement();
		obj.chromeLaunch();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize window 
		driver.manage().deleteAllCookies();//to delete all cookies

		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Travel Agent Login")).click();
		
		

	}

}
