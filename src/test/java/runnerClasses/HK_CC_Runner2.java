package runnerClasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"features/HK_CC.feature"},
		glue={"stepDefinition"},
		plugin={"html:target/cucumber-html-report"}
		)
public class HK_CC_Runner2 {
	
	
	}
