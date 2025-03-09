package GenericLibrary;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public static WebDriver driver;
	
	public static void openUrl(String url) {
		driver.get(url);
	}
	
	public static void pageload(String url) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.urlContains(url));
	}
	
	public static void webelementload(WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void switchwindow(String url) {
		Set<String> address = driver.getWindowHandles();
		for(String s:address) {
			driver.switchTo().window(s);
			if(driver.getCurrentUrl().contains(url)) {
				break;
			}
		}
	}
	
	public static String currentUrl() {
		String currenturl = driver.getCurrentUrl();
		return currenturl;
	}
	
	public static String title() {
		String title = driver.getTitle();
		return title;
	}
	
	public static void forward() {
		driver.navigate().forward();
	}
	
	public static void maxbrowser() {
		driver.manage().window().maximize();
	}
	
	public static void waitbrowser(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	public static void closeurl() {
		driver.quit();
	}
}
