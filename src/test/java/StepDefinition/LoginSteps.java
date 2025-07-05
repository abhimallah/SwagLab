package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import GlobalDriver.DriverManager;
import PageObjects.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	Login loginPage;
	
	public LoginSteps(){
		loginPage = new Login(DriverManager.getDriver());
	}
	
	//Login loginPage = new Login(driver);
	
	@Given("User is on swaglab demo webpage")
	public void user_is_on_swaglab_demo_webpage() {
		//driver = new ChromeDriver();
		DriverManager.getDriver().get("https://www.saucedemo.com/v1/");
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User enter <userName> and <password> on login page")
	public void user_enter_user_name_and_password_on_login_page() {
		loginPage.enterUserName();
		loginPage.enterPassword();
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		loginPage.clickSubmitButton();
	}

	@Then("User should able to see dashboard page")
	public void user_should_able_to_see_dashboard_page() {
		DriverManager.getDriver().close();
	}
}
