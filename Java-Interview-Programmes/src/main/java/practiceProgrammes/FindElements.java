package practiceProgrammes;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Photon WorkSpace\\\\Java-Interview-Programmes\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		List<WebElement> urls =driver.findElements(By.tagName("a"));
		System.out.println(urls.size());
		
		
		for(WebElement elements: urls) {
			
			System.out.println(elements);
			
		}
		
		
	}

}
