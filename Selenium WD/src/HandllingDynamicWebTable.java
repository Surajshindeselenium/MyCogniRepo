import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandllingDynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Photon WorkSpace\\Selenium WD\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.name("email")).sendKeys("surajshinde0809@gmail.com");
		driver.findElement(By.name("password")).sendKeys("perFume@66");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#main-nav > a:nth-child(3) > span")).click();
		
		//Method - 1 Using for loop 
		
		String before_xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		String after_xpath = "]/td[2]";
		
		for(int i=1; i<=3;i++) {
			String name = driver.findElement(By.xpath("before_xpath"+i+"after_xpath")).getText();
			System.out.println(name);
			if(name.contains("Suraj Shinde")) {
				
				////*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[1]/div/label
				driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[1]/div/label")).click();
				
			}
		}
		
		//Method - 2 customized xpath 
		
		
		
		
		driver.quit();

	}

}
