package Class28POM;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Test1 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			Page1 p1=new Page1();
			PageFactory.initElements(driver,p1);
			p1.setUserName();
			
			

			
		}

}
