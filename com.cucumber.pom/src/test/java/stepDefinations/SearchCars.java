package stepDefinations;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuidHomePageActions;
import pages.actions.SearchCarsPageActions;
import utility.SeleniumDriver;

public class SearchCars {

	CarsGuidHomePageActions carsGuidHomePageActions = new CarsGuidHomePageActions();
	SearchCarsPageActions searchCarsPageActions = new SearchCarsPageActions();
	SoftAssert softAssert = new SoftAssert();//creating object of SoftAssert class

	@Given("^I am on home page \"([^\"]*)\" of cars guild\\.com$")
	public void i_am_on_home_page_of_cars_guild_com(String websiteURL) {

		SeleniumDriver.openPage(websiteURL);

	}

	@When("^I move to the menu$")
	public void i_move_to_the_menu(List<String> list) {

		String menu = list.get(1);
		System.out.println("Selected Menu" + menu);
		carsGuidHomePageActions.moveToBuyAndSellMenu();

	}

	@And("^click on \"([^\"]*)\" Search Cars link$")
	public void click_on_Search_Cars_link(String SearchCars) {

		carsGuidHomePageActions.clickOnSearchCarsMenu();

	}

	@And("^select carbrand as \"([^\"]*)\" from the Any Make dropdown$")
	public void select_carbrand_as_from_the_Any_Make_dropdown(String carBrand){
		
		SeleniumDriver.waitForPageToLoad();
		searchCarsPageActions.selectCarMake(carBrand);

	}

	@And("^select model as \"([^\"]*)\" from the Any Model dropdown$")
	public void select_model_as_from_the_Any_Model_dropdown(int carModel) {

		searchCarsPageActions.selectCarModel(carModel);

	}

	@And("^select location as \"([^\"]*)\" from the Any location dropdown$")
	public void select_location_as_from_the_Any_location_dropdown(String location) {

		searchCarsPageActions.selectLocation(location);

	}

	@And("^select Price as \"([^\"]*)\" from the Price\\(max\\) dropdown$")
	public void select_Price_as_from_the_Price_max_dropdown(String carPrice) {

		searchCarsPageActions.selectPrice(carPrice);

	}

	@When("^click on Find_My_Next_Car button$")
	public void click_on_Find_My_Next_Car_button() {

		searchCarsPageActions.clickOnFindMyNextCar();
	}

	@Then("^I should see searched cars$")
	public void i_should_see_searched_cars() {
		System.out.println("Car List Found");
	}

	@And("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String expectedPageTitle) {

		String ActualPageTitle = SeleniumDriver.getDriver().getTitle();
		System.out.println("Actual page title-->" + ActualPageTitle);
		System.out.println("Expected page title-->" + expectedPageTitle);
		Assert.assertEquals(expectedPageTitle, ActualPageTitle);

	}
	
	@When("^click on All New lable$")
	public void click_on_All_New_lable()  {
		
		searchCarsPageActions.clickOnAllNewCarsLink();
	    
	}

	@Then("^page title of new cars search should be \"([^\"]*)\"$")
	public void page_title_of_new_cars_search_should_be(String expectedPageTitle) {
		
		String ActualPageTitle = SeleniumDriver.getDriver().getTitle();
		System.out.println("Actual page title-->" + ActualPageTitle);
		System.out.println("Expected page title-->" + expectedPageTitle);
		Assert.assertEquals(expectedPageTitle, ActualPageTitle);
		
		
	    
	}


}
