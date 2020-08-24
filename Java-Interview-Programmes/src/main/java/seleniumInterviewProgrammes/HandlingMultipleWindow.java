package seleniumInterviewProgrammes;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Photon WorkSpace\\\\Java-Interview-Programmes\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		String parent = driver.getWindowHandle();
		System.out.println("Parent window id is  "+parent);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		int windows = allWindows.size();
		System.out.println(windows);
		for(String child: allWindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);//switching new opened window 
				String title= driver.getTitle();
				Assert.assertEquals(title, "Sakinalium | Home");
				Thread.sleep(5000);
				driver.close();
			}
			
			driver.switchTo().window(parent);//switching back to parent window 
			
		}
	}

}
