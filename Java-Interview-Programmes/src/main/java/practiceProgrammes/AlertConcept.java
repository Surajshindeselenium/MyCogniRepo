package practiceProgrammes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AlertConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Photon WorkSpace\\\\Java-Interview-Programmes\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("234");
		WebElement sbmtBttn = driver.findElement(By.name("submit"));
		Alert alert = driver.switchTo().alert();
		String message =alert.getText();
		System.out.println(message);
		alert.accept();
//		Actions action = new Actions(driver);
//		action.contextClick(sbmtBttn).perform();
		
		
	}

}
