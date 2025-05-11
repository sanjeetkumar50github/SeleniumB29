package Class28POM;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginDemo3 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException {	
			
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://demo.actitime.com/login.do");
			LoginPage2 l=new LoginPage2(driver);
			l.setUserName("abcd");
			l.setPassword("xyz");
			l.clickLoginButton();
			Thread.sleep(1000);
			l.setUserName("admin");
			l.setPassword("manager");
			l.clickLoginButton();
			
		}
}