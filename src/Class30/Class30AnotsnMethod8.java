package Class30;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;


public class Class30AnotsnMethod8 {
	
	
	@BeforeClass 
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterClass 
	public void logout() {
		Reporter.log("logout",true);
	}
	
	@AfterClass 
	public void quit() {
		Reporter.log("quit",true);
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
