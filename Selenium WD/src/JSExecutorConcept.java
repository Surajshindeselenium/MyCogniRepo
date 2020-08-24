import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Photon WorkSpace\\Selenium WD\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("surajshinde0809@gmail.com");
		driver.findElement(By.name("password")).sendKeys("perFume@66");
		WebElement logIn =driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		clickOnElement(logIn, driver);

	}
	
	public static void clickOnElement(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments(0).click();",element);
		
	}

}
