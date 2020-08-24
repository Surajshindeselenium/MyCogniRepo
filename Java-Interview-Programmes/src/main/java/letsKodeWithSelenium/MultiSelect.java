package letsKodeWithSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		List<WebElement> multiSelect = driver.findElements(By.id("multiple-select-example"));
		
		Select selectFruit = new Select((WebElement) multiSelect);
		
		selectFruit.getFirstSelectedOption().click();
		
		
		
		
	}

}
