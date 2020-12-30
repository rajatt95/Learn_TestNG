package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersFromXML {

	@Parameters({ "browser", "environment" })
	@Test
	public void getBrowser(String browser, String environment) {
		System.out.println("Browser: " + browser);

		System.out.println("environment: " + environment);
	}
}
