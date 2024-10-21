package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featuresWithTags",glue= {"StepDefinitions"},
tags="(@smoke or @important) and not @smoke2 "
		)

//the tags can be inherit by its super tags
//tags="@must "   will run all scenarios because it is used in features

public class TestRunnerWithTags {


}

/*

Useful Tips - General
Tags can be placed above the following Gherkin elements:

Feature
Scenario
Scenario Outline
Examples

It is not possible to place tags above Background or steps (Given, When, Then, And and But)


@smoke 				--Scenarios tagged with @smoke
@smoke and @fast 	--Scenarios tagged with both @smoke and @fast
@gui or @database  	--Scenarios tagged with either @gui or @database
@fast and not @slow --Scenarios tagged with @fast that aren't also tagged with @slow






Useful Tips - Tags Inheritance
Tags are inherited by child elements.
Tags that are placed above a Feature will be inherited by Scenario, Scenario Outline,
or Examples.

 */
