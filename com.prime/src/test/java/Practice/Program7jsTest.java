package Practice;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.JavaScriptUtility;

public class Program7jsTest extends BaseClass{
	@Test
	public void scroll() throws InterruptedException {
		JavaScriptUtility j= new JavaScriptUtility();
		j.scrollbottom();
		Thread.sleep(5000);
	}
}
