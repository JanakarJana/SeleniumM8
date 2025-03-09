package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@class='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@class='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement login;
	
	public WebElement getemail() {
		return email;
	}
	public WebElement getpassword() {
		return password;
	}
	public WebElement getlogin() {
		return login;
	}
}
