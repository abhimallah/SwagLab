package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Base.Base;

public class Login extends Base {
	WebDriver driver;
	
	public Login(WebDriver driver){
		super(driver);
	}

	@FindBy(id="user-name")
	private WebElement userName;

	@FindBy(id="password")
	private WebElement password;

	@FindBy(id="login-button")
	private WebElement submitButton;


	public void enterUserName() {
		userName.sendKeys("standard_user");
	}

	public void enterPassword() {
		password.sendKeys("secret_sauce");
	}

	public void clickSubmitButton() {
		submitButton.click();
	}
}
