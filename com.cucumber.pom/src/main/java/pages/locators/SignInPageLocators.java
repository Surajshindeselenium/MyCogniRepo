package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPageLocators {
	
	@FindBy(how=How.XPATH,using = "//input[@name='email']")
	public WebElement userId;
	
	@FindBy(how=How.XPATH,using = "//input[@name='password']")
	public WebElement userPassword;
	
	@FindBy(how=How.XPATH ,using = "//button[@type='submit']")
	public WebElement SignInbutton;
	
	@FindBy(how=How.XPATH ,using = "//span[@class='animated fadeInUp']/span")
	public WebElement wrongCredentialsMessage;
	
	
	
	

}
