package GenericLibrary;

import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptUtility {
	JavascriptExecutor js;
	
	public JavaScriptUtility() {
		js= (JavascriptExecutor) WebDriverUtility.driver;
	}
	
	public void scrollup(int x, int y) {
		js.executeScript("window.scrollby("+x+","+y+");");
	}
	
	public void scrolldown(int x, int y) {
		js.executeScript("window.scrollby("+x+","+-y+");");
	}
	
	public void scrolltop() {
		js.executeScript("window.scrollTo(0,document.body.scrollTop)");
	}
	
	public void scrollbottom() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
