package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.SelectUtility;

public class Program5DropdownTest extends BaseClass {
	@Test
	public void dropdown() {
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		WebElement element = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		SelectUtility u = new SelectUtility(element);
		List<WebElement> options = u.getoptions();
		for(WebElement e: options) {
			Reporter.log(e.getText(),true);
		}
		
	}
}
