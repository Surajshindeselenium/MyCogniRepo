package seleniumInterviewProgrammes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAllLinks {

	// Write a Java Program to open all links of gmail.com
	public static void main(String[] args) {

		/*
		 * It is a typical example of advanced for loop which we have seen in our
		 * previous programs.
		 * 
		 * Once you have opened a website such as Gmail using get() or navigate().to(),
		 * you can use a
		 * 
		 * tagName locator to find the tag name of a website that will return all the
		 * tags.
		 * 
		 * We have advanced for loop where we have created a new WebElement link2 for a
		 * link(which already has
		 * 
		 * located all the tags), then we have got all the links through
		 * getAttribute(“href”) and got all the
		 * 
		 * texts through getText().
		 */
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Photon WorkSpace\\\\Java-Interview-Programmes\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());

		for (WebElement link2 : link) {

			// print the links i.e. http://google.com or https://www.gmail.com
			System.out.println(link2.getAttribute("href"));

			// print the links text
			System.out.println(link2.getText());

		}
	}

}
