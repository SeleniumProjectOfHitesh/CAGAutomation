package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.HKHomePage;
import pageObject.CC_Results_Page;



public class Step_Definition_HK_CC
{

	WebDriver driver;
	private Hooks hook;
	
	HKHomePage homepage;
	CC_Results_Page resultsPage;
	ExtentReports logger = new ExtentReports(System.getProperty("user.dir")+"\\Reports\\ExtentReports.html",true);
	ExtentTest test = logger.startTest("HK CC Test case");
	
	
	public Step_Definition_HK_CC(Hooks hook)
	{
		this.hook=hook;
	}
	
	
	@Given("^Open browser and start the application HK CC$")
    public void open_browser_and_start_the_application_HK_CC() throws Throwable {
	  
	   driver = hook.getDriver();
	   homepage = new HKHomePage(driver);
	   driver = homepage.navigateToWebApp();
	   
	}

	
	@When("^I click on credit card button on home page$")
    public void i_click_on_credit_card_button_on_home_page() throws Throwable {
		
		resultsPage = homepage.navigateToHKCCPage();
    }
	
	
	@Then("^user should be redirected to results page for CCsuccessfully$")
    public void user_should_be_redirected_to_results_page_for_CCsuccessfully() throws Throwable
	{
		resultsPage.verifyURL();
		test.log(LogStatus.PASS,"ULR Verfies successfully");
		logger.endTest(test);
		logger.flush();
	}

}
