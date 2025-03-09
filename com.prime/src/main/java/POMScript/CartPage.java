package POMScript;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//td[@class='product']")
	private List<WebElement> product;
	
	@FindBy(xpath = "//span[@class='cart-qty']")
	private WebElement qty;
	
	@FindBy(xpath = "//input[@name='removefromcart']")
	private List<WebElement> checkbox;
	
	@FindBy(xpath="//input[@value='Update shopping cart']")
	private WebElement update;
	
	public List<WebElement> getproduct(){
		return product;
	}
	
	public WebElement getquantity() {
		return qty;
	}
	
	public List<WebElement> getcheckbox(){
		return checkbox;
	}
	
	public WebElement getupdate() {
		return update;
	}
	
}
