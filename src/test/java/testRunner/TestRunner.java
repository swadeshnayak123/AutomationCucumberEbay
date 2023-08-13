package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = {"stepdefinition"},
		//tags = "@AdvancePage",
	    plugin = {"pretty", "html:BDDcucumber/target/cucumberReport.html"}
		)

public class TestRunner {
	
}
