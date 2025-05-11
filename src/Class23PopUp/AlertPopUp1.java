package Class23PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertPopUp1 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class23/Class23PopUpDemo.html");
			Thread.sleep(1000);
			driver.findElement(By.id("A1")).submit();
			Thread.sleep(1000);
			Alert alert= driver.switchTo().alert();
			
			String msg=alert.getText();
			System.out.println(msg);
			alert.accept();//click ok
//			alert.dismiss();//click cancel

		}
}
