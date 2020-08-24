package seleniumInterviewProgrammes;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Photon WorkSpace\\\\Java-Interview-Programmes\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"<a href=\"http://toolsqa.com/automation-practice-switch-windows/\">http://toolsqa.com/automation-practice-switch-windows/</a>");
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window's handle -> " + parentWindowHandle);
		WebElement clickElement = driver.findElement(By.id("button1"));

		for (int i = 0; i < 3; i++) {
			clickElement.click();
			Thread.sleep(3000);
		}

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String handle : allWindowHandles) {
			System.out.println("Switching to window - > " + handle);
			System.out.println("Navigating to google.com");
			driver.switchTo().window(handle); // Switch to the desired window first and then execute commands using
												// driver
			driver.get("<a href=\"http://toolsqa.com\">http://toolsqa.com</a>");

		}
	}
}
