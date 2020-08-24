package letsKodeWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		
		WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
		WebElement benzRadio = driver.findElement(By.id("benzradio"));
		WebElement hondaRadio = driver.findElement(By.id("hondaradio"));
		
		if(!benzRadio.isSelected()) {
			
			benzRadio.click();
			
		}
		
		

	}

}
