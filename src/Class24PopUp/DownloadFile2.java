package Class24PopUp;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Alert popup
public class DownloadFile2 {
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

			String filename = driver.findElement(By.id("DirectLink_12")).getText();
			System.out.println(filename);
			
			Thread.sleep(3000);
			
			String user=System.getProperty("user.home");
			File f = new File(user+"/Downloads/"+filename);
			if(f.exists())
			{
				System.out.println("File is downloaded");
				
			}
			else
			{
				System.out.println("File is not downloaded");
			}
			
						
		}
}