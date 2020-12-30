package customListeners_captureScreenshotAfterFailureAndSendZipFile;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomListenersImplementation extends TestBase {

	@Test
	public void loginTest() {

		driver.get("https://www.google.com/");
		driver.findElement(By.id("identidfffdfierId")).sendKeys("xyz@gmail.com");
	}



	@Test
	public void composeEmail() {

		Assert.fail("Error in composing Email");
	}
}
