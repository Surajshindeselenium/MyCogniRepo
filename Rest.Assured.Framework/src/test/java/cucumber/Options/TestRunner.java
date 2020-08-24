package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Photon WorkSpace\\Rest.Assured.Framework\\src\\test\\java\\featureFiles",
glue= "stepDefinations",
monochrome = true, 
dryRun = false 
)
public class TestRunner {
	
	

}
