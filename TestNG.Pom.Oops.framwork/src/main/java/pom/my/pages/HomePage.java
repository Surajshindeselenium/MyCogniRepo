/**
 * 
 */
package pom.my.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author 348333
 *
 */
public class HomePage extends BasePage {
	
	private By header = By.xpath("//i18n-string[@data-key='app.header.title']");

	public HomePage(WebDriver driver) {
		
		super(driver);
		
	}
	
	public WebElement getPageheader() {
		
		return getElement(header);
	}
	public String getHomePageTitle() {
		
		return getPageTitle();
	}
	
	public String getHomePageHeader() {
		
		return getPageHeader(header);
		
	}

}
