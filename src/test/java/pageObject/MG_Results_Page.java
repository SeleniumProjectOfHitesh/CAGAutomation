package pageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MG_Results_Page extends HKHomePage {

	public MG_Results_Page(WebDriver driver) {
		super(driver);
		
	}
	
	public void verifyURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.moneyhero.com.hk/en/mortgage");
		   
	}

}
