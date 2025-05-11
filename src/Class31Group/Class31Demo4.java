package Class31Group;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class31Demo4 {

	@BeforeMethod(alwaysRun = true)
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout() {
		Reporter.log("logout",true);
	}
	
	@Test(groups = {"smoke","user"})
	public void createUser() {
		Reporter.log("create user",true);
	}
	
	@Test(groups = {"user"})
	public void editUser() {
		Reporter.log("edit user",true);
	}
	
	
	@Test(groups = {"user"})
	public void deleteUser() {
		Reporter.log("delete user",true);
	}
	
	
	@Test(groups = {"smoke","customer"})
	public void createCustomer() {
		Reporter.log("create Customer",true);
	}
	
	@Test(groups = {"customer"})
	public void editCustomer() {
		Reporter.log("edit Customer",true);
	}
	
	
	@Test(groups = {"customer"})
	public void deleteCustomer() {
		Reporter.log("delete Customer",true);
	}
}

