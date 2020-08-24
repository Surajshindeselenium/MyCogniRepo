import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandelling extends ChromeProperties {

	public static void main(String[] args) {
		
		FrameHandelling obj = new FrameHandelling();
		obj.chromeLaunch();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize window 
		driver.manage().deleteAllCookies();//to delete all cookies
		
		//dynamic waits
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://freecrm.co.in/");
		
		driver.findElement(By.linkText("LOG IN")).click();
		driver.findElement(By.name("email")).sendKeys("Surajshinde0809@gmail.com");
		driver.findElement(By.name("password")).sendKeys("perFume@66");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		
		
		//driver.quit();

	}

}
