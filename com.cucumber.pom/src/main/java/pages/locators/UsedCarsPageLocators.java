package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarsPageLocators {
	
	@FindBy(how=How.ID,using = "makes")
	public WebElement anyMakeDropdown;
	
	@FindBy(how=How.ID,using = "models")
	public WebElement anyModel;
	
	@FindBy(how=How.ID,using = "locations")
	public WebElement anyLocation;
	
	@FindBy(how=How.ID,using = "priceTo")
	public WebElement priceTo;
	
	@FindBy(how=How.ID,using = "search-submit")
	public WebElement findMyNextUsedCar;
	
	
	
	

}
