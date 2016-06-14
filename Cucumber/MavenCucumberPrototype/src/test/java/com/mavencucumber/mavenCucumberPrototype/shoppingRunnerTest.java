package com.mavencucumber.mavenCucumberPrototype;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features = "src/test/resources", plugin = { "pretty",
		"html:target/cucumber-html-report", "json:target/json/ouput.json" }

)
public class shoppingRunnerTest{
}
