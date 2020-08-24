package pom.my.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page {

	public BasePage(WebDriver driver) {

		super(driver);

	}

	@Override
	public String getPageTitle() {

		return driver.getTitle();

	}

	@Override
	public String getPageHeader(By locator) {

		return getElement(locator).getText();

	}

	@Override
	public WebElement getElement(By locator) {

		WebElement element = null;

		try {
			element = driver.findElement(locator);

			return element;
		} catch (Exception e) {

			System.out.println("Some error occured while creating element: " + element.toString());

			e.printStackTrace();
		}

		return element;

	}

	@Override
	public void waitForElementPresent(By locator) {

		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			System.out.println("Some exeption/error occured while waiting for element:" + locator.toString());
		}

	}

	@Override
	public void waitForTitlePresent(String title) {

		try {
			wait.until(ExpectedConditions.titleContains(title));
		} catch (Exception e) {
			System.out.println("Some exeption/error occured while waiting for element:" + title);
		}

	}

}
