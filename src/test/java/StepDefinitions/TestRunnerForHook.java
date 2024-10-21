package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/hooksTestFeature/",glue= {"hooksStepDefinition"}
		)
public class TestRunnerForHook {

	

	}

