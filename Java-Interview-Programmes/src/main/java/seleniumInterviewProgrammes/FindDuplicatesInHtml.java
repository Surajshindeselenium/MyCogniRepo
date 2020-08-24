package seleniumInterviewProgrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindDuplicatesInHtml {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Photon WorkSpace\\\\Java-Interview-Programmes\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchBox= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchBox.sendKeys("Java");
		searchBox.sendKeys(Keys.ENTER);
		String text = "Java";
		List<WebElement> words = driver.findElements(By.xpath("//*[text() = '" + text + "']"));
		
		for(WebElement we:words){
			   System.out.println(we.getText());
			}
		System.out.println(words.size());
	}

}
