package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericLibrary.ActionUtility;
import GenericLibrary.BaseClass;

public class Program6ActionsTest extends BaseClass {
	@Test
	public void drag2() throws InterruptedException {
		WebElement el = driver.findElement(By.xpath("(//a[contains(txt(),'Computers')])[3]"));
		WebElement le = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		ActionUtility a = new ActionUtility(driver);
		a.draganddrop(el, le);	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
