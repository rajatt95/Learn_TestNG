package testcases;

import org.testng.annotations.Test;

public class TestFailure extends BaseTest {

	@Test
	public void doLogin() {
		System.out.println("Failing the Login test");

		System.out.println("Capturing screenshot");
	}

}
