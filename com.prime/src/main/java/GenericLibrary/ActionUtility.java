package GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtility {
	public Actions a;
	
	public ActionUtility(WebDriver driver) {
		a = new Actions(driver);
	}
	
	public void doubleclick(WebElement element) {
		a.doubleClick(element).perform();
	}
	
	public void rightclick(WebElement element) {
		a.contextClick(element).perform();
	}
	
	public void draganddrop(WebElement source, WebElement destination) {
		a.dragAndDrop(source, destination).perform();
	}
	
	public void moveto(WebElement element) {
		a.moveToElement(element).perform();
	}
}
