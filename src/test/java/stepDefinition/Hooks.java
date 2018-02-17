package stepDefinition;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks {
	
	private static  boolean flag = false;
	private WebDriver driver;
	
	@Before("@Chrome")
	public void setUpChrome()
	{
		if(!flag)
		{

			
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			flag=true;
			
		}	
		
		
	}
	
	@Before("@InternetExplorer")
	public void setUpInternetExplorer()
	{
		if(!flag)
		{
			System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer_Win32_2.52.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			flag=true;
			
		}	
		
		
	}
	
	
	@Before("@Firefox")
	public void setUpFirefox()
	{
		if(!flag)
		{
			System.setProperty("webdriver.gecko.driver","src\\test\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			flag=true;
			
		}	
		
		
	}
	
	public WebDriver getDriver()
	{
		
		return driver;
	}
	
	@After
	public void teardown(Scenario scenario)
	{
		
		final byte[] screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES);
    scenario.embed(screenshot, "image/png");
		flag=false;
		driver.quit();
	}
	

}
