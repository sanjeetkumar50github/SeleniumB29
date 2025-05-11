package Class27Frame;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			LoginPage l=new LoginPage(driver);
			l.setUserName("admin");
			l.setPassword("manager");
			l.clickLoginButton();
		}
}
