package stepDefinations;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuidHomePageActions;
import pages.actions.SignInPageActions;

public class SignInPage {
	
	CarsGuidHomePageActions carsGuidHomePageActions = new CarsGuidHomePageActions();
	SignInPageActions signInPageActions = new SignInPageActions();
	
	@When("^user mousehover SignUp/SignIn$")
	public void user_mousehover_SignUp_SignIn() {
		
		carsGuidHomePageActions.mouseHoverToSignUpSignIn();
	    
	    
	}

	@Then("^click on Sign in$")
	public void click_on_Sign_in() {
	    
		carsGuidHomePageActions.clickOnSignIn();
		
	}

	@Then("^User enters \"([^\"]*)\" email$")
	public void user_enters_email(String arg1) {
		
		signInPageActions.enterUserId(arg1);
	    
	    
	}

	@Then("^User enters \"([^\"]*)\" password$")
	public void user_enters_password(String arg1) {
		
		signInPageActions.enterUserPassword(arg1);
	    
	}

	@Then("^user clicks on Sign in button$")
	public void user_clicks_on_Sign_in_button() {
		
		signInPageActions.clickOnSignIn();
	    
	}

	@Then("^Validate login$")
	public void validate_login() {
		
		signInPageActions.validateInvalidCredentials();
	    
	}

	
	
}
