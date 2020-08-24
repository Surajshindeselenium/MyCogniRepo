import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliciteWaitConcept extends ChromeProperties {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		ImpliciteWaitConcept obj = new ImpliciteWaitConcept();
		obj.chromeLaunch();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize window 
		driver.manage().deleteAllCookies();//to delete all cookies
		
		//dynamic waits
		//if page/elements load within 3-5 Seconds then rest of time will be ignored and will be performed actions
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);//global element-will be application for all the elements
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//global element-will be application for all the elements
		
		//Static/hard wait
		//if page/elements load within 3-5 Seconds then also it will wait for 10 sec
		Thread.sleep(10000);
		
		driver.get("https://freecrm.co.in/");
		
		
		

	}

}
