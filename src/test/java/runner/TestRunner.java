package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\features\\addToCart.feature",
				glue={"stepdefinitions"},
				plugin={"pretty","html:reports/cucumberReports.html"},
				dryRun=false
				//tags="@new"
				
				
		)
public class TestRunner {
	
}
