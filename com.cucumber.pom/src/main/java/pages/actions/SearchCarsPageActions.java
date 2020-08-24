package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.SearchCarsPageLocators;
import utility.SeleniumDriver;
import utility.Waits;

public class SearchCarsPageActions {

	SearchCarsPageLocators searchCarsPageLocators = null;
	Waits wait = new Waits();

	public SearchCarsPageActions() {

		this.searchCarsPageLocators = new SearchCarsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchCarsPageLocators);

	}

	public void selectCarMake(String carBrand) {

		Select selectCarMaker = new Select(searchCarsPageLocators.anyMakeDropdown);
		selectCarMaker.selectByVisibleText(carBrand);

	}

	public void clickOnAllNewCarsLink() {

		searchCarsPageLocators.allNewCarsLink.click();

	}

	public void selectCarModel(int carModel) {

		SeleniumDriver.waitForPageToLoad();

		Select selectModel = new Select(searchCarsPageLocators.modelsDropdown);

		selectModel.selectByIndex(carModel);

	}

	public void selectLocation(String location) {

		Select selectCarLocation = new Select(searchCarsPageLocators.locationsDropdown);

		selectCarLocation.selectByVisibleText(location);

	}

	public void selectPrice(String price) {

		Select selectCarPrice = new Select(searchCarsPageLocators.priceToDropdown);

		selectCarPrice.selectByVisibleText(price);

	}

	public void clickOnFindMyNextCar() {

		//searchCarsPageLocators.findMyNextCarButton.click();
		Waits.clickOn(SeleniumDriver.getDriver(), searchCarsPageLocators.findMyNextCarButton, 20);
		
	}

}
