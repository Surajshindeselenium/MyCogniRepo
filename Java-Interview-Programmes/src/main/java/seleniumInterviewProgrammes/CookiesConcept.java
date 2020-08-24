package seleniumInterviewProgrammes;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Photon WorkSpace\\\\Java-Interview-Programmes\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Set cookies= driver.manage().getCookies();
		
		ArrayList<String> arr = new ArrayList<String>(cookies);
		
		for(String element:arr) {
			System.out.println(element);
		}
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
