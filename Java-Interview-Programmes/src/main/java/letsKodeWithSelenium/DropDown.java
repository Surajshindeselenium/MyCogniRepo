package letsKodeWithSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		WebElement myDropdown =driver.findElement(By.id("carselect"));
		
		
		Select select = new Select(myDropdown);
		select.selectByValue("benz");
		select.selectByIndex(2);
		select.selectByVisibleText("BMW");
		
		Thread.sleep(5000);
		
		System.out.println("Using list concept..");
		
		List<WebElement> carsDropdown = driver.findElements(By.id("carselect"));
		for(WebElement values: carsDropdown) {
			
			String car = values.getText();
			
			System.out.println(car);
						
		}

	}

}
