/**
 * 
 */
package com.MyTest.Package;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.my.pages.HomePage;
import pom.my.pages.LogInPage;

/**
 * @author 348333
 *
 */
public class LogInTest extends BaseTest {
	
	@Test(priority =1)
	public void verifyLogInPagetitleTest() {
		
		String title = page.getInstance(LogInPage.class).getLoginPageTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "HubSpot Login");
		
		
	}
	
	@Test(priority =2)
	public void verifyLogInPageHeaderTest() {
		
		String header = page.getInstance(LogInPage.class).getLogInPageHeader();
		System.out.println(header);
		
		Assert.assertEquals(header, "Don't have an account?");
		
		
	}
	
	@Test(priority =2)
	public void doLogInTest() {
		
		HomePage homePage = page.getInstance(LogInPage.class).doLogIn("surajshinde0809@gmail.com", "Forever@1234");
		String homePageHeader = homePage.getHomePageHeader();
		System.out.println(homePageHeader);
		
		Assert.assertEquals(homePageHeader, "Setup Guide");
		
		
	}
	
	

}
