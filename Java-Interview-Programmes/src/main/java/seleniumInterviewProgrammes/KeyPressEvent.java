package seleniumInterviewProgrammes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPressEvent {

	public static void main (String[] args) throws AWTException {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Photon WorkSpace\\\\Java-Interview-Programmes\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		//To enter key, we can use below approaches 
		//1. Using sendKeys
		driver.findElement(By.id("target")).sendKeys(Keys.DOWN);
		
		//2.Robot class 
		
		Robot robot = new Robot();
		
//		robot.keyPress(KeyEvent.VK_9);
//		robot.keyPress(KeyEvent.VK_3);
//		robot.keyPress(KeyEvent.VK_BACK_SPACE);
//		robot.keyPress(KeyEvent.VK_F1);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		
		
	}
		
	}


