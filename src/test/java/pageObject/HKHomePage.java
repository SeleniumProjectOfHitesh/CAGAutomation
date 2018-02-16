package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ReadProperties;

public class HKHomePage extends AbstractPage{
	
	ReadProperties object = new ReadProperties();
	
	public HKHomePage(WebDriver driver)
	{
		
      super(driver);
      PageFactory.initElements(driver, this);
      
	}
	
    @FindBy(xpath=".//*[@id='hero-cc-btn']")
    WebElement ccbtn;
    
    @FindBy(xpath=".//*[@id='hero-pl-btn']")
    WebElement plbtn;
    
    @FindBy(xpath=".//*[@id='hero-mg-btn']")
    WebElement mgbtn;
	
	public WebDriver navigateToWebApp()
	{
		
		driver.get(object.getPropertyValue("appurl"));
		return driver;
		
		
	}
	
	public CC_Results_Page navigateToHKCCPage()
	{
		webElementClick(ccbtn);
		return new CC_Results_Page(driver);
	}

	
	public PL_Results_Page navigateToHKPLPage()
	{
		webElementClick(plbtn);
		return new PL_Results_Page(driver);
	}

	public MG_Results_Page navigateToHKMGPage()
	{
		webElementClick(mgbtn);
		return new MG_Results_Page(driver);
	}
}
