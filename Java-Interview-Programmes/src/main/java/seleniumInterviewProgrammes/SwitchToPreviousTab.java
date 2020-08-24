package seleniumInterviewProgrammes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToPreviousTab {

	// Write a Selenium code to switch to the previous tab
	public static void main(String[] args) throws AWTException {

		/*
		 * We have demonstrated the use of the Robot class. We see this as an important
		 * third party because we can achieve the different navigation within a browser
		 * and its tabs if you know the shortcut keys.
		 * 
		 * For example, if you have three tabs open in your chrome and you want to go to
		 * the middle tab, then you have to press control + 2 from your keyboard. The
		 * same thing can be achieved through the code as well.
		 * 
		 * Observe the following code (just after we see the instantiation of Robot
		 * class). we have used the Robot class object called a robot with two inbuilt
		 * methods keyPress(KeyEvenet.VK_*) and keyRelease(KeyEvenet.VK_*).
		 * 
		 * 
		 */
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Photon WorkSpace\\\\Java-Interview-Programmes\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebElement element1 = driver.findElement(By.name("q"));
		element1.sendKeys("software testing help");
		element1.sendKeys(Keys.ENTER);
		String a = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md'][1]"))
				.sendKeys(a);;
		Robot robot = new Robot(); // instantiated robot class
		robot.keyPress(KeyEvent.VK_CONTROL); // with robot class you can easily achieve anything if you know the
												// shortcut keys
		robot.keyPress(KeyEvent.VK_2); // here, we have just pressed ctrl+2
		robot.keyRelease(KeyEvent.VK_CONTROL); // once we press and release ctrl+2, it will go to the second tab.
		robot.keyRelease(KeyEvent.VK_2); // if you again want to go back to first tab press and release vk_1
		driver.quit();
	}

}
