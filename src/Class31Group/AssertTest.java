package Class31Group;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertTest {

	@BeforeMethod
	public void openApp() {
		Reporter.log("open the browser",true);
	}
	
	@AfterMethod
	public void closeApp() {
		Reporter.log("close the browser",true);
	}
	@Test
	public void testA() {
		
		Reporter.log("Enter url",true);
		Reporter.log("Enter un, pwd & click login",true);
		Reporter.log("Verify Home Page is displayed or not",true);
//		Assert.fail();//this will change the status of the test to 'FAILED
		String ev="abcd";
		String av="xyz";
//		if(ev.equals(av)) {
//			Reporter.log("PASS.....",true);
//		}
//		else
//		{
//			Assert.fail();
//		}
		
		Assert.assertEquals(av, ev);
		Reporter.log("End of testA",true);
	}
}