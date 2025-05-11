package Class30;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AnotsnMethod {
	
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	
	@Test
	public void createUser() 
	{
		Reporter.log("createUser",true);
	}
	
	@Test(invocationCount = 2)
	public void deleteUser() 
	{
		Reporter.log("deleteUser",true);
	}
}
