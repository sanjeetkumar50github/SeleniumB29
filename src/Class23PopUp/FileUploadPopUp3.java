package Class23PopUp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUploadPopUp3 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class23/Class23PopUpDemo.html");
			Thread.sleep(1000);
//			driver.findElement(By.id("A2")).sendKeys("F:/Book1.xlsx");
			driver.findElement(By.id("A2")).sendKeys("C:\\Users\\mrsan\\OneDrive\\Pictures\\Screenshots");
			
				
				

		}
}
