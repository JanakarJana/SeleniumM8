package POMScript;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.SelectUtility;

public class DigitalDownloadsPage extends BasePage {
	public DigitalDownloadsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "(//input[@value='Add to cart'])")
	private List<WebElement> addtocart;
	
	public List<WebElement> getaddtocart() {
		return addtocart;
	}
}
