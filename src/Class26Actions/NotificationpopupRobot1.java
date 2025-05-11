package Class26Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Notification popup
public class NotificationpopupRobot1 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.irctc.co.in/");
			Thread.sleep(4000);
			Robot r=new Robot();
			//press tab twice so that "allow' is focused 
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			//click allow by pressing Enter
			r.keyPress(KeyEvent.VK_ENTER);
		}
}

