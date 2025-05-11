package Class21PageLoad;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PageLoadTimeOut {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			WebDriver driver =new ChromeDriver();
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			
			Duration t = driver.manage().timeouts().getPageLoadTimeout();
			System.out.println(t);
			try 
			{
				driver.get("https://demo.actitime.com/login.do");
				System.out.println("Page is loaded within 10s");
			}
			catch (Exception e) 
			{
				System.out.println("Page is not loaded within 10s");
			}
			
			System.out.println("End");
		}
}

