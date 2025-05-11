package Class23PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*File download in firefox browser click on download link will 

*/
public class FileDownloadfromMozila6 {
	static 
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException {	
			
			WebDriver driver =new FirefoxDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class23/Class23PopUpDemo.html");
			Thread.sleep(1000);
			driver.findElement(By.id("A3")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("PageLink_9")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("DirectLink"
					+ "_12")).click();	
			Thread.sleep(1000);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);	
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
		}
}
