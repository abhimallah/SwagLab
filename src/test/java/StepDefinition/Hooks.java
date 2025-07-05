package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import GlobalDriver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
	WebDriver driver;
	
	@Before
	public void setup() throws IOException
	{
		driver=DriverManager.getDriver(); 	    	
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();		
	}
	
	@After
	public void closeBrowser() throws IOException
	{
		driver.close();		
	}
}
