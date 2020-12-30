package customListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

	public void onTestFailure(ITestResult result) {

		System.setProperty("org.uncommons.reportng.escape-output", "false");

		/* Reporter.log("Screenshot link"); */

		// in the same tab
		Reporter.log("<a href=\"d:\\error_toSend.jpg\">Screenshot link</a>");

		// in the new tab
		Reporter.log("<a target=\"_blank\" href=\"d:\\error_toSend.jpg\">Screenshot link in new tab</a>");

		// Image
		Reporter.log("<img height=200 widht=200 src=\"d:\\error_toSend.jpg\"/></a>");

		System.out.println("Capturing screenshot for the failed test -- " + result.getName());
	}
}
