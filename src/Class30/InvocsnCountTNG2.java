package Class30;

import org.testng.Reporter;
import org.testng.annotations.Test;
/* Can we run a test method multiple times without loop?
 * --YES -> invocationCount
 * What is the default invocationCount?
 * 1
 * Note: if its 0 or any -ve no. it will not execute the test method
 * we can use final variable- int (no float)
 */

public class InvocsnCountTNG2 {

	final int i=5;
	@Test(invocationCount = i)
	public void createUser() {
		Reporter.log("createUser:Bhanu",true);
	}
	
	

}
