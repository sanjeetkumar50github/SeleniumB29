package Class27Frame;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoFrame1 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, AWTException {	
			
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.get("file:///D:/Selenium%20Class%20Doc/Class27/sample1.html");
			
			driver.switchTo().frame(0);//using index
			driver.findElement(By.id("t2")).sendKeys("A");
			driver.switchTo().defaultContent();//exit from frame
			driver.findElement(By.id("t1")).sendKeys("A");
			
			
			driver.switchTo().frame("f1");//using id or name
			driver.findElement(By.id("t2")).sendKeys("B");
			driver.switchTo().defaultContent();//exit from frame
			driver.findElement(By.id("t1")).sendKeys("B");
			
			WebElement frameElement = driver.findElement(By.xpath("//iframe[@src='sample2.html']"));
//			WebElement frameElement = driver.findElement(By.xpath("//input"));
			driver.switchTo().frame(frameElement);//using address of the frame element
			driver.findElement(By.id("t2")).sendKeys("C");
			driver.switchTo().parentFrame();
			driver.findElement(By.id("t1")).sendKeys("C");
			
		}
}

