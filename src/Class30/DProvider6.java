package Class30;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/*Iteration depends on number of rows present in data provider array
 *number of arguments depend on no of columns 
 * 
 * 
 */
public class DProvider6 {
	@DataProvider
	public String[][] getData() {
		String[][] user=new String[3][2];
		user[0][0]="UserA";
		user[0][1]="A123";
		
		user[1][0]="UserB";
		user[1][1]="B123";
		
		user[2][0]="UserC";
		user[2][1]="C123";
		
		return user;
	}
	
	@Test(dataProvider = "getData")
	public void createUser(String un,String pw) 
	{
		Reporter.log("createUser:"+un+ " "+pw,true);
	}
	
}
