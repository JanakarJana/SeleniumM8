package GenericLibrary;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtility {
	public Select s;
	
	public SelectUtility(WebElement element) {
		s = new Select(element);
	}
	
	public void byindex(int index) {
		s.selectByIndex(index);
	}
	
	public void byvalue(String value) {
		s.selectByValue(value);
	}
	
	public void byvisibletext(String value) {
		s.selectByVisibleText(value);
	}
	
	public void deselectall() {
		s.deselectAll();
	}
	
	public void deselectbyindex(int index) {
		s.deselectByIndex(index);
	}
	
	public void deselectbyvalue(String value) {
		s.deselectByValue(value);
	}
	
	public void deselectbytext(String text) {
		s.deselectByVisibleText(text);
	}
	
	public WebElement getfirstoption() {
		WebElement option = s.getFirstSelectedOption(); 
		return option;
	}
	
	public List<WebElement> getalloptions() {
		List<WebElement> options = s.getAllSelectedOptions();
		return options;
	}
	
	public List<WebElement> getoptions() {
		List<WebElement> options = s.getOptions();
		return options;
	}
	
	public boolean ismultiple() {
		boolean b = s.isMultiple();
		return b;
	}
	
}

