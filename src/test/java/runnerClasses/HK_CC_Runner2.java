package runnerClasses;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"features/HK_CC.feature"},
		glue={"stepDefinition"},
		plugin={"html:target/cucumber-html-report",
				"com.cucumber.listener.ExtentCucumberFormatter:Reports/reports.html"		
		}
		)
public class HK_CC_Runner2 {
	
	@AfterClass
    public static void reportSetup() 
 	{
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	//,"features/HK_PL.feature","features/HK_MG.feature"
	
	}

	
}