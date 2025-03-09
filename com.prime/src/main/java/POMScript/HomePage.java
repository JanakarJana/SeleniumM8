package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath ="//a[@class='ico-register']")
	private WebElement reglink;
	
	@FindBy(xpath = "//a[@class='ico-login']")
	private WebElement login;
	
	@FindBy(xpath ="(//span[@class='cart-label'])[1]")
	private WebElement cart;
	
	@FindBy(xpath = "//a[contains(text(),'Digital downloads')]")
	private WebElement digitaldownloads;
	
	public WebElement getreglink() {
		return reglink;
	}
	
	public WebElement getlogin() {
		return login;
	}
	
	public WebElement getcart() {
		return cart;
	}
	
	public WebElement getdigital() {
		return digitaldownloads;
	}
}
