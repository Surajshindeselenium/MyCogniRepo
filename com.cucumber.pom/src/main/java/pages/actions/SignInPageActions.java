package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuidHomePageLocators;
import pages.locators.SignInPageLocators;
import utility.SeleniumDriver;
import utility.Waits;

public class SignInPageActions extends Waits {

	SignInPageLocators signInPageLocators = null;

	public SignInPageActions() {

		this.signInPageLocators = new SignInPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), signInPageLocators);

	}

	public void enterUserId(String userid) {

		//signInPageLocators.userId.sendKeys(userid);
		sendKeys(SeleniumDriver.getDriver(), signInPageLocators.userId, 20, userid);

	}

	public void enterUserPassword(String password) {

		signInPageLocators.userPassword.sendKeys(password);

	}
	
	public void clickOnSignIn() {
		
		signInPageLocators.SignInbutton.click();
		
	}
	
	public void validateInvalidCredentials() {
		
		signInPageLocators.wrongCredentialsMessage.isDisplayed();
	}

}
