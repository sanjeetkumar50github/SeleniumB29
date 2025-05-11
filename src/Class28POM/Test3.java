package Class28POM;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test3 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("http://www.google.com");
			Page3 p3=new Page3(driver);
			p3.printLinkCount();
			p3.printAllLinks();
			driver.close();
			
			

			
		}

}