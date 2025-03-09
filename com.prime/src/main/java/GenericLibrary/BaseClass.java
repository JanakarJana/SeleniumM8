package GenericLibrary;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
@Listeners(ListenerImplementation.class)
public class BaseClass extends WebDriverUtility {
	@BeforeSuite
	public void connectserver() {
		Reporter.log("Connecting to server",true);
	}
	
	@BeforeTest
	public void connectDB() {
		Reporter.log("Connecting to database",true);
	}
	
	@BeforeClass
	public void openbrowser() throws IOException {
		driver = new ChromeDriver();
		maxbrowser();
		waitbrowser(15);
		openUrl(PropertyUtility.getData("url"));
	}
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
	
}
