package Class27Frame;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encapsulsn {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			
//		    driver.findElement(By.id("username")).sendKeys("admin");
			
//			WebElement unTB=driver.findElement(By.id("username"));
//			unTB.sendKeys("admin");
//			
//			WebElement unTB;
//			unTB=driver.findElement(By.id("username"));
//			unTB.sendKeys("admin");
			
			A a1=new A(driver);
			a1.setUserName("Sanjeet");
		}
}


