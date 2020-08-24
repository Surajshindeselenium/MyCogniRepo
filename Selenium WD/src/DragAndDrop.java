import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends ChromeProperties {

	public static void main(String[] args) throws InterruptedException {
		
		DragAndDrop obj = new DragAndDrop();
		obj.chromeLaunch();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize window 
		driver.manage().deleteAllCookies();//to delete all cookies

		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/");
		
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(0);//switching into frame 
		
		Actions action = new Actions(driver);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Thread.sleep(5000);
		action.dragAndDrop(drag, drop).build().perform();
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
