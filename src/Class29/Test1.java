package Class29;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class29/Class29PopUpDemo.html");
			Thread.sleep(1000);
			Page1 p1=new Page1(driver);
			p1.clickSubmit();
			Thread.sleep(1000);
			p1.closeAlert();
			Thread.sleep(1000);
			driver.close();
			
			
			
			

			
		}

}