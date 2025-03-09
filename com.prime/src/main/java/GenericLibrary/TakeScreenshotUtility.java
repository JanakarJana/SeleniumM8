package GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class TakeScreenshotUtility {
	public static void takescreenshot(String Name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) WebDriverUtility.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(IConstant.screenshot_path+Name+".png");
		Files.copy(source,destination);
	}
}
