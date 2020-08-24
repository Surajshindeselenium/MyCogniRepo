import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Photon WorkSpace\\Selenium WD\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		System.out.println(driver.getTitle());
		//1. linkText
		driver.findElement(By.linkText("Sign in")).click();
		//2. id
		WebElement user_id=driver.findElement(By.id("userid"));
		user_id.sendKeys("Suraj123");
		//3.name
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("Password");
		
		WebElement submit=driver.findElement(By.id("sgnBt"));
		submit.click();
		
		//4.partial linkText
		driver.findElement(By.partialLinkText("Text a temporary password")).click();
		
		//5. cssSelector 
		driver.findElement(By.cssSelector("#inflowfyp")).click();
		
		//6.className
		//7.xpath
		
		
		//driver.quit();
		
		
		
		

	}

}
