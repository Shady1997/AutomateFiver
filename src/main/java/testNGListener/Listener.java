package testNGListener;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

import main.ClassProperties;
import main.Start;
import utility.Utility;

public class Listener extends ClassProperties implements ITestListener {

	public void onTestStart(ITestResult result) {
	}

	public void onTestSuccess(ITestResult result) {
	}

	public void onTestFailure(ITestResult result) {
		// take screenshot on test failure
		Start.getScreenshotOnFailure();
	}

	public void onTestSkipped(ITestResult result) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
	}

}
