package Class24PopUp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Alert popup
public class DownloadFile1 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class24/class24PopUpDemo.html");
			Thread.sleep(1000);
			driver.findElement(By.id("A3")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("PageLink_9")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("DirectLink_12")).click();	
			Thread.sleep(3000);
			
			//FileInputStream f;
			try 
			{
				FileInputStream f1 = new FileInputStream("C:\\Users\\user\\Downloads\\nodal_datasheet.pdf");
				System.out.println("File is downloaded");
				
			} catch (FileNotFoundException e) {

				System.out.println("File is not downloaded");
			}
			
						
		}
}
