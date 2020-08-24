package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.UsedCarsPageLocators;
import utility.SeleniumDriver;

public class UsedCarsPageActions {
	
	UsedCarsPageLocators usedCarsPageLocators = null;
	
	public UsedCarsPageActions() {
		
		this.usedCarsPageLocators = new UsedCarsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarsPageLocators);
	}
	
	

}
