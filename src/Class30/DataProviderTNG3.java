package Class30;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/*How to run Test multiple times with diff data?
 * -->Data Provider
 * Return type is array.
 * 
 */

public class DataProviderTNG3 {

	@DataProvider
	public String[] getData() {
		String[] user= {"Akshara","Bhanu","Chandra"};
		return user;
	}
	
	@Test(dataProvider = "getData")
	public void createUser(String un) 
	{
		Reporter.log("createUser:"+un,true);
	}
	
	@DataProvider
	public Object[] getData2() {
		Object[] user= {"Akshara",123,true};
		return user;
	}
	
	@Test(dataProvider = "getData2")
	public void createUser2(Object un) 
	{
		Reporter.log("createUser:"+un,true);
	}

}
