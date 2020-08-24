package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuidHomePageLocators;
import utility.SeleniumDriver;

public class CarsGuidHomePageActions {

	CarsGuidHomePageLocators carsGuidHomePageLocators = null;

	public CarsGuidHomePageActions() {

		this.carsGuidHomePageLocators = new CarsGuidHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuidHomePageLocators);

	}

	public void moveToBuyAndSellMenu() {

		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuidHomePageLocators.buySellLink).build().perform();

	}

	public void clickOnSearchCarsMenu() {

		carsGuidHomePageLocators.searchCarsLink.click();

	}

	public void clickOnUsedCarsMenu() {

		carsGuidHomePageLocators.usedCarsLink.click();

	}

	public void clickOnNewCarsMenu() {

		carsGuidHomePageLocators.newCarsCarsLink.click();

	}

	public void clickOnFindADealerMenu() {

		carsGuidHomePageLocators.findDealerLink.click();

	}

	public void clickWhatCarShouldIBuyMenu() {

		carsGuidHomePageLocators.whatCarShoulIBuyLink.click();

	}

	public void moveToReviewsMenu() {

		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuidHomePageLocators.reviewsLink).build().perform();

	}

	public void clickOnMake() {
		
		carsGuidHomePageLocators.makeOnHomePage.click();
		
	}
	
	public void selectAbarthCar() {
		
		carsGuidHomePageLocators.AbarthCars.click();
	}
	
	public void selectAbarthModel() {
		
		carsGuidHomePageLocators.model595C.click();
	}
	
	public void mouseHoverToSignUpSignIn() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuidHomePageLocators.SignUpSignIn).build().perform();
	}
	
	public void clickOnSignIn() {
		
		carsGuidHomePageLocators.SignIn.click();
		
	}

}