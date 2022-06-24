package cucumbertest;

import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		
		features = "GoogleSearch.feature",
		glue = {"stepDefinition"}
		
		)


public class TestRunner {
	
	
	

}
