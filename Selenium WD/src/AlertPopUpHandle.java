import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle extends ChromeProperties {

	public static void main(String[] args) throws InterruptedException {
		
		AlertPopUpHandle obj = new AlertPopUpHandle();
		obj.chromeLaunch();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		
		
		String altText = alert.getText();
		System.out.println(altText);
		
		if(altText.equals("Please enter a valid user name")) {
			System.out.println("Correct alert message");
		}
		else {
			System.out.println("Not correct alert message");
		}
		
		Thread.sleep(5000);
		
		alert.accept();//to click on ok button
		//alert.dismiss();//to click on cancel button
		
		
		driver.quit();
		

	}

}
