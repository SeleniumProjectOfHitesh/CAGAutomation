package pageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CC_Results_Page extends AbstractPage{

	public CC_Results_Page(WebDriver driver) {
		super(driver);
		

}
	public void verifyURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.moneyhero.com.hk/en/credit-card/best-deals/results");
		   
	}
	
	

	
	
}
