package customListeners_captureScreenshotAfterFailureAndSendZipFile;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends TestBase implements ITestListener {

	// When Test case get failed, this method is called.

	public void onTestFailure(ITestResult Result) {

		String methodName = Result.getName().toUpperCase();
		System.out.println("The name of the testcase failed is :" + methodName);

		try {
			testUtil.captureScreenshot(methodName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onFinish(ITestContext Result) {
		// Zipping Screenshot folder
		testUtil.zip(System.getProperty("user.dir") + "\\screenshot");

		MonitoringMail monitoringMail = new MonitoringMail();
		try {
			monitoringMail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject,
					TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
