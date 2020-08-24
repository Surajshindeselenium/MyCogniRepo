package stepDefinations;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarShortListActions;
import pages.actions.CarsGuidHomePageActions;
import utility.SeleniumDriver;

public class CarShortListing {

	CarsGuidHomePageActions carsGuidHomePageActions = new CarsGuidHomePageActions();
	CarShortListActions carShortListActions = new CarShortListActions();

	@When("^user clicks on make dropdown and user selects moke as \"([^\"]*)\"$")
	public void user_clicks_on_make_dropdown_and_user_selects_moke_as(String arg1) {
		carsGuidHomePageActions.clickOnMake();
		carsGuidHomePageActions.selectAbarthCar();
	}

	@Then("^model dropdown opens and User selects model as \"([^\"]*)\"$")
	public void model_dropdown_opens_and_User_selects_model_as(String arg1) {

		carsGuidHomePageActions.selectAbarthModel();

	}

	@Then("^Verify title as \"([^\"]*)\"$")
	public void verify_title_as(String expectedPageTitle) {

		String actualTitle = SeleniumDriver.getDriver().getTitle();
		System.out.println("Actual title is" + actualTitle);
		System.out.println("Expected title is" + expectedPageTitle);

		Assert.assertEquals(actualTitle, expectedPageTitle);

	}

	@Then("^user selects car as \"([^\"]*)\"$")
	public void user_selects_car_as(String arg1) {

		carShortListActions.selectAbarth595C();

	}

	@Then("^user clicks on Add to shortlist button$")
	public void user_clicks_on_Add_to_shortlist_button() {

		carShortListActions.clickOnAddToShortlist();

	}

}
