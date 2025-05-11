package Class30;

import org.testng.Reporter;
import org.testng.annotations.Test;
/*Can we dev multiple TEST methods in same class?---> YES
 * What is the default order of execution?> -->Alpha
 * How to run the test in req order?---> Using priority
 * Note: default priority is 0
 * if methods have same priority then --->alpha
 * -20    -10  -1 0   1  4  7  90
 *
 */
public class DemotestNG1 {

	final int i=-10;
	@Test(priority = i )
	public void registerUser() {
		Reporter.log("registerUser",true);
	}
	
	@Test
	public void editUser() {
		Reporter.log("editUser",true);
	}
	
	@Test(priority = 10 )
	public void deleteUser() {
		Reporter.log("deleteUser",true);
	}
	

}