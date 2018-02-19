package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.HKHomePage;
import pageObject.MG_Results_Page;



public class Step_Definition_HK_MG
{

	WebDriver driver;
	private Hooks hook;
	
	HKHomePage homepage;
	MG_Results_Page resultsPage;
//	ExtentReports logger;
//	ExtentTest test;
	
	public Step_Definition_HK_MG(Hooks hook)
	{
		this.hook=hook;
		//this.logger = hook.logger;
		//this.test = hook.test;
	}
	
	@Given("^Open browser and start the application HK MG$")
	public void open_browser_and_start_the_application_HK_MG() throws Throwable {
		driver = hook.getDriver();
		 
		   homepage = new HKHomePage(driver);
		   driver = homepage.navigateToWebApp();
		//   test.log(LogStatus.INFO, "Navigated to Home page");
		   
	}

	@When("^I click on MG button on home page$")
	public void i_click_on_MG_button_on_home_page() throws Throwable {
		
		resultsPage = homepage.navigateToHKMGPage();
	//	test.log(LogStatus.INFO, "Navigated to MG Page");
		
	}

	@Then("^user should be redirected to results page for MG successfully$")
	public void user_should_be_redirected_to_results_page_for_MG_successfully() throws Throwable {
		
		resultsPage.verifyURL();
		//test.log(LogStatus.PASS,"ULR Verfies successfully");
		

}
}
