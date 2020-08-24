import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Photon WorkSpace\\Selenium WD\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		//validation point Actual vs Expected 
		if(title.equals("Google")) {
			
			System.out.println("Title is correct");
			
		}
		else {
			
			System.out.println("Title not correct");
			
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		
	}

}
