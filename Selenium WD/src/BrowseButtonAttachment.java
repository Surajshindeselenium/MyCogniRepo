import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseButtonAttachment extends ChromeProperties {

	public static void main(String[] args) throws InterruptedException {
		
		BrowseButtonAttachment obj = new BrowseButtonAttachment();
		obj.chromeLaunch();
		WebDriver driver = new ChromeDriver();
		driver.get("https://png2jpg.com/");
		Thread.sleep(6000);
		WebElement browse=driver.findElement(By.xpath("//*[@id=\"pick-files\"]/span[2]"));
		browse.sendKeys("C:\\PS-PFERemediationScript.log");

	}

}
