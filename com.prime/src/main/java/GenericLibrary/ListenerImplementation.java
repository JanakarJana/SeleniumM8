package GenericLibrary;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		String Name = result.getName();
		Reporter.log(Name +"Execution started", true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		String Name = result.getName();
		Reporter.log(Name +"passed",true);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		String Name = result.getName();
		Reporter.log(Name +"test case failed",true);
		try {
			TakeScreenshotUtility.takescreenshot(result.getName());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
