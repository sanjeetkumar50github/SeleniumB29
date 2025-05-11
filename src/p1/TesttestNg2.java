package p1;

import org.testng.Reporter;
import org.testng.annotations.Test;

/*
 * in selenium we develop two classes.
 * 1.POM class
 * 2.Test Class
 * #POM class--#Web page
 * #TC---#MTC
 * 
 * To run the multiple test cases and get result--TestNg-Unit testing frame work
 */

//no main method -instead og that we use test method -any method within @test
//no sop---Reporter.log

public class TesttestNg2 {
	
	@Test
	public void testB()
	{
		Reporter.log("This is my testB",true);
		
	}

}
