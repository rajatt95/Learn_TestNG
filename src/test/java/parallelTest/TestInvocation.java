package parallelTest;

import org.testng.annotations.Test;

public class TestInvocation extends BaseTest {

	@Test(invocationCount = 5, threadPoolSize = 5)
	public void executeTest() {
		driver = getDriver("chrome");
		driver.get("https://www.google.com/");
		System.out.println("Title: " + driver.getTitle());

		driver.quit();
	}
}
