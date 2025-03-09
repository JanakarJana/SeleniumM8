package Practice;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.JavaScriptUtility;
import POMScript.CartPage;
import POMScript.DigitalDownloadsPage;
import POMScript.HomePage;
import POMScript.LoginPage;

public class Program8POMTest extends BaseClass {
	
	@Test
	public void testcase1() throws InterruptedException {
	HomePage h = new HomePage(driver);
	h.getlogin().click();
	
	LoginPage l = new LoginPage(driver);
	l.getemail().sendKeys("asdftest123@gmail.com");
	l.getpassword().sendKeys("test123");
	l.getlogin().click();
	
	h.getcart().click();
	CartPage c = new CartPage(driver);
	List<WebElement> box = c.getcheckbox();
	for(WebElement e: box) {
		Thread.sleep(1000);
		e.click();
	}
	c.getupdate().click();
	
	h.getdigital().click();
	DigitalDownloadsPage d = new DigitalDownloadsPage(driver);
	 List<WebElement> element = d.getaddtocart();
	 for(WebElement e:element) {
		 Thread.sleep(1000);
		 e.click();
	 }
	 JavaScriptUtility j = new JavaScriptUtility();
	 j.scrolltop();
	 Thread.sleep(1000);
	 h.getcart().click();
	 List<WebElement> ele = c.getproduct();
	 int i = ele.size();
	 WebElement el = c.getquantity();
	 String s = el.getText();
	 String sub = s.substring(1, 2);
	 System.out.println(sub);
	 int k = Integer.parseInt(sub);
	 Assert.assertEquals(k,i);
 }
}
