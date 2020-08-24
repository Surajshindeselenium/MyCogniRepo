package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import utility.SeleniumDriver;

public class AfterActions {

	@After
	public static void tearDown(Scenario scenario) throws Exception {

		// WebDriver driver=SeleniumDriver.getDriver();
		System.out.println(scenario.isFailed());
		if (scenario.isFailed()) {

			System.out.println("This is screenshot method");

			
			takeSnapShot(SeleniumDriver.getDriver(), 
			"C:\\Photon WorkSpace\\com.cucumber.pom\\FailedScreenShots\\"+scenario.getName());
//             byte[] screenshotBytes = ((TakesScreenshot) SeleniumDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
//             scenario.embed(screenshotBytes, "image/png");
			
			
		}

		SeleniumDriver.tearDown();
	}
	
	 public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

	        //Convert web driver object to TakeScreenshot

	        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File(fileWithPath);

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);

	    }
	


}
