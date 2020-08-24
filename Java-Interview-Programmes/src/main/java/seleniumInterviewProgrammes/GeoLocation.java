package seleniumInterviewProgrammes;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeoLocation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Photon WorkSpace\\\\Java-Interview-Programmes\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Map<String, Object> coordinatesMap = new HashMap<String, Object>();
		coordinatesMap.put("latitude", 41.881832);
		coordinatesMap.put("longitude", -87.623177);
		coordinatesMap.put("accuracy", 1);

		((ChromeDriver) driver).executeCdpCommand("Emulation.setGeolocationOverride", coordinatesMap);

		driver.get("https://oldnavy.gap.com/stores");
		

	}

}
