package seleniumInterviewProgrammes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class SampleCarsAu {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Photon WorkSpace\\\\Java-Interview-Programmes\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.carsguide.com.au/");
		
		Actions action = new Actions(driver);
		WebElement buyeandselllink = driver.findElement(By.linkText("buy + sell"));
		action.moveToElement(buyeandselllink).build().perform();
		driver.findElement(By.linkText("Search Cars")).click();
		
		Select carBrands = new Select(driver.findElement(By.id("makes")));
		carBrands.selectByIndex(2);
		//carBrands.selectByVisibleText("BMW");

	}

}
