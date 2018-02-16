package stepDefinition;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.HKHomePage;
import pageObject.PL_Results_Page;



public class Step_Definition_HK_PL
{

	WebDriver driver;
	private Hooks hook;
	
	HKHomePage homepage;
	PL_Results_Page resultsPage;
	
	public Step_Definition_HK_PL(Hooks hook)
	{
		this.hook=hook;
	}
	
	@Given("^Open browser and start the application HK PL$")
	public void open_browser_and_start_the_application_HK_PL() throws Throwable {
		driver = hook.getDriver();
		homepage = new HKHomePage(driver);
		driver = homepage.navigateToWebApp();
	}

	@When("^I click on PL button on home page$")
	public void i_click_on_PL_button_on_home_page() throws Throwable {
		resultsPage = homepage.navigateToHKPLPage();
		
	}

	@Then("^user should be redirected to results page for PL successfully$")
	public void user_should_be_redirected_to_results_page_for_PL_successfully() throws Throwable {
		
		resultsPage.verifyURL();
	}

}
