package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarShortListingLocators {
	
	@FindBy(how=How.XPATH,using = "//img[@alt='2018 Abarth 595C']")
	public WebElement AbarthCar595C;
	
	@FindBy(how=How.XPATH,using = "//button[@data-shortlist-id='11062426']")
	public WebElement addToShortlist;


}
