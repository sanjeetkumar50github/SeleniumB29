package Class31Group;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

	@BeforeMethod
	public void openApp() {
		Reporter.log("open the browser", true);

	}

	@Test
	public void testA() {
		Reporter.log("login", true);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("abcd", "xyz");// verify title
		Reporter.log("End of testA", true);
		softAssert.assertAll();// it will report the status

	}

	@AfterMethod
	public void closeApp() {
		Reporter.log("close the browser", true);
	}

}