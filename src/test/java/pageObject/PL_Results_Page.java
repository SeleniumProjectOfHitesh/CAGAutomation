package pageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PL_Results_Page extends HKHomePage {

	public PL_Results_Page(WebDriver driver) {
		super(driver);
		
	}
	public void verifyURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.moneyhero.com.hk/en/personal-loan/personal-instalment/results");
		   
	}
	
}
