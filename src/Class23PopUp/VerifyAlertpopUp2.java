package Class23PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyAlertpopUp2 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class23/Class23PopUpDemo.html");
			Thread.sleep(1000);
			driver.findElement(By.id("A1")).submit();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
			//How do u verify that alert popup is displayed or not
			try
			{
				wait.until(ExpectedConditions.alertIsPresent());
				System.out.println("Alter popup is present");
				Alert alert= driver.switchTo().alert();
				String msg=alert.getText();
				System.out.println(msg);
				alert.accept();//click ok
//				alert.dismiss();//click cancel
			}
			catch (Exception e) {
				System.out.println("Alter popup is NOT present");
			}
				
				
				

		}
}
