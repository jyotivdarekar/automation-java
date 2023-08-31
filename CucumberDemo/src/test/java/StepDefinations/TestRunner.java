package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/LogInPractice.feature"},
		
		glue = {"StepDefinations"},
		
		plugin = {"pretty","html:target/Reports/HTMLReport.html","json:target/Reports/JsonReport.json","junit:target/XMLReports.xml"
				}
		
		

		
		) 
	


public class TestRunner {

}
