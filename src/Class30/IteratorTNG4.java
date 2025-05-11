package Class30;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/*How to run Test multiple times with diff data?
 * -->Data Provider
 * return type:
 * Object[]
 * Object[][]
 * Iterator<Object>  (any collection type)
 * Iterator<Object[]>
 */

public class IteratorTNG4 {

	@DataProvider
	public Iterator<String> getData() {
		ArrayList<String> data=new ArrayList<String>();
		data.add("A");
		data.add("B");
		data.add("C");
		Iterator<String> iData = data.iterator();
		return iData;
	}
	
	@Test(dataProvider = "getData")
	public void createUser(String un) 
	{
		Reporter.log("createUser:"+un,true);
	}
	
//	@DataProvider
//	public Object[] getData2() {
//		Object[] user= {"Akshara",123,true};
//		return user;
//	}
//	
//	@Test(dataProvider = "getData2")
//	public void createUser2(Object un) 
//	{
//		Reporter.log("createUser:"+un,true);
//	}

}
