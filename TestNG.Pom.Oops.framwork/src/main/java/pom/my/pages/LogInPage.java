/**
 * 
 */
package pom.my.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author SurajShinde
 *
 */
public class LogInPage extends BasePage {
	
	private By emailId = By.id("username");
	private By password = By.id("password");
	private By logInButton = By.id("loginBtn");
	private By pageHeader = By.xpath("//i18n-string[@data-key='login.signupLink.text']");
	

	public LogInPage(WebDriver driver) {
		
		super(driver);
		
	}

	//getters
	
	public WebElement getEmailId() {
		
		return getElement(emailId);
		
	}

	public WebElement getPassword() {
		
		return getElement(password);
	}

	public WebElement getLogInButton() {
		
		return getElement(logInButton);
	}

	public WebElement getPageheader() {
		
		return getElement(pageHeader);
	}
	public String getLoginPageTitle() {
		
		return getPageTitle();
	}
	
	public String getLogInPageHeader() {
		
		return getPageHeader(pageHeader);
		
	}
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	
	public HomePage doLogIn(String username, String password) {
		
		getEmailId().sendKeys(username);
		getPassword().sendKeys(password);
		getLogInButton().click();
		
		return getInstance(HomePage.class);
	}
	/**
	 *	
	 * @return
	 */
	public void doLogIn() {
		
		getEmailId().sendKeys(" ");
		getPassword().sendKeys(" ");
		getLogInButton().click();
		
	}
	
	public void doLogIn(String userCred) {
		
		if(userCred.contains("username")) {
			getEmailId().sendKeys(userCred.split(":")[1]);
		}
		else if(userCred.contains("password")) {
			getEmailId().sendKeys(userCred.split(":")[1]);
		}
		getLogInButton().click();
		
	}

}
