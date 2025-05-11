package Class23PopUp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//File download from Chrome
public class FileDownloadFromChrome5 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class23/Class23PopUpDemo.html");
			Thread.sleep(1000);
			driver.findElement(By.id("A3")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("PageLink_9")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("DirectLink_12")).click();	
			
				

		}
}
