package Class31Group;

import org.testng.Reporter;
import org.testng.annotations.Test;
/*What is the o/p? 
 * 1) 'registerUser' -> 'deleteUser'
 * 2) 'deleteUser'   -> 'registerUser'
 * 
 * How to run registerUser and then delete user?
 * --> using priority
 * 
 * How to run delete user only if registerUser is pass?
 */
public class dependsOnMethods {
	
	@Test(dependsOnMethods = "deleteUser")
	public void createUser() {
		Reporter.log("createUser",true);
	}
	
	@Test(dependsOnMethods = "createUser")
	public void deleteUser() {
		Reporter.log("deleteUser",true);	
	}
	
	
}