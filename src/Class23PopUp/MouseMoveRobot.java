package Class23PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MouseMoveRobot {
	static 
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException {	
			
			WebDriver driver =new FirefoxDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class23/Class23PopUpDemo.html");
			Robot robot=new Robot();
			int x=10,y=10;
			for(int i=1;i<=10;i++)
			{
				robot.mouseMove(x,y);
				x=x+10;
				y=y+10;
				Thread.sleep(500);
			}
		}
}
