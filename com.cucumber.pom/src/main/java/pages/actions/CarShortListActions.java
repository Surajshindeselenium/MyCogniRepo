package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.CarShortListingLocators;
import utility.SeleniumDriver;

public class CarShortListActions {
	
	CarShortListingLocators carShortListingLocators = null;

	public CarShortListActions() {

		this.carShortListingLocators = new CarShortListingLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carShortListingLocators);

	}
	
	public void selectAbarth595C() {
		
		carShortListingLocators.AbarthCar595C.click();
		
	}
	
	public void clickOnAddToShortlist() {
		
		carShortListingLocators.addToShortlist.click();
	}

}
