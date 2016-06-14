package myPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features = "src/myPackage", plugin = { "pretty",
		"html:target/cucumber-html-report" }// , tags = { "@smoke" }
		 
// tags={"@smoke,@sanity"}
)
public class shoppingTestRunner{//  extends AbstractTestNGCucumberTests {
}
