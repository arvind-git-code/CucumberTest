package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/backgroundDemoFeature/",glue= {"StepDefinitionForBackground"}, monochrome=true,

		 plugin= {"pretty",
				 "junit:target/JunitReports/abc.xml",
				 "json:target/JSONReports/report.json",
				 "html:target/HTMLReports/report.html"}
)

public class TestRunnerForBackgroundDemo {

	
}
