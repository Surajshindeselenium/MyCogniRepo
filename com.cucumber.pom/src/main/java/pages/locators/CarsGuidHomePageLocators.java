package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuidHomePageLocators {
	
	
	//Main Menus 

	public WebElement my;
	@FindBy(how=How.LINK_TEXT,using = "buy + sell")
	public WebElement buySellLink;
	
	@FindBy(how=How.LINK_TEXT,using = "reviews")
	public WebElement reviewsLink;
	
	@FindBy(how=How.LINK_TEXT,using = "news")
	public WebElement newsLink;
	
	@FindBy(how=How.LINK_TEXT,using = "advice")
	public WebElement adviceLink;
	
	@FindBy(how=How.LINK_TEXT,using = "pricing + specs")
	public WebElement pricingSpecsLink;
	
	@FindBy(how=How.LINK_TEXT,using = "labs")
	public WebElement labsLink;
	
	@FindBy(how=How.LINK_TEXT,using = "guides")
	public WebElement guidesLink;
	
	//options in buy + sell menu
	
	@FindBy(how=How.LINK_TEXT,using = "Search Cars")
	public WebElement searchCarsLink;
	
	@FindBy(how=How.LINK_TEXT,using = "Used")
	public WebElement usedCarsLink;
	
	@FindBy(how=How.LINK_TEXT,using = "New")
	public WebElement newCarsCarsLink;
	
	@FindBy(how=How.LINK_TEXT,using = "Find a Dealer")
	public WebElement findDealerLink;
	
	@FindBy(how=How.LINK_TEXT,using = "What car should I buy?")
	public WebElement whatCarShoulIBuyLink;
	
	@FindBy(how=How.LINK_TEXT,using = "Sell my car")
	public WebElement sellMyCarLink;
	
	@FindBy(how=How.LINK_TEXT,using = "Manage My Ad")
	public WebElement manageMyAdLink;
	
	@FindBy(how=How.LINK_TEXT,using = "Car Selling Tips")
	public WebElement carSellingTipsLink;
	
	@FindBy(how=How.ID, using = "uhf-make")
	public WebElement makeOnHomePage;
	
	@FindBy(how=How.LINK_TEXT, using = "Abarth")
	public WebElement AbarthCars;
	
	@FindBy(how=How.LINK_TEXT, using = "595C")
	public WebElement model595C;
	
	@FindBy(how=How.LINK_TEXT, using = "Sign up / Sign in")
	public WebElement SignUpSignIn;
	
	@FindBy(how=How.LINK_TEXT, using = "Sign in")
	public WebElement SignIn;
	
	
}
