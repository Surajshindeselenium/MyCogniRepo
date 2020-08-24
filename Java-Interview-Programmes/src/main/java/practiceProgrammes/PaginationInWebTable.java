package practiceProgrammes;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationInWebTable {

	public static void main(String[]args){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Photon WorkSpace\\\\Java-Interview-Programmes\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		
		int pageinationSize =  driver.findElements(By.cssSelector("#example_paginate>span>a")).size();
		
		List<String> name = new ArrayList<String>();
		
		for(int i=0; i<=pageinationSize; i++) {
			
			String paginationSelector = "#example_paginate>span>a:nth-child("+i+")";
			driver.findElement(By.cssSelector(paginationSelector)).click();
			
		}
		
	}
	
	

}
