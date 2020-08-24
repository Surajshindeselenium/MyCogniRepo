package stepDefinations;

import cucumber.api.java.Before;
import utility.SeleniumDriver;

public class BeforeActions {
	
	@Before
	public static void setUp() {
		
		SeleniumDriver.SetUpDriver();
		
	}
	
}
