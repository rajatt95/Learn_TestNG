package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase3 extends BaseTest {

	@Test(priority = 1, groups = { "functional", "smoke" })
	public void doUserReg() {

		System.out.println("Executing User Registration Test");
		Assert.fail("User not registered successfully");
	}

	@Test(priority = 2, dependsOnMethods = "doUserReg", groups = { "functional", "smoke" })

	public void doLogin() {
		System.out.println("Executing Login Test");
	}

	@Test(priority = 3, dependsOnMethods = "doUserReg", alwaysRun = true, groups = { "functional", "smoke" })
	public void thirdTest() {
		System.out.println("Executing Third Test");
	}

	@Test(priority = 4, groups = "bvt")
	public void fourthTest() {
		System.out.println("Executing fourth test");
	}

}
