package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class class15selectclick {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class15/class15Element.html");
			Thread.sleep(1000);
			boolean res ;
			res = driver.findElement(By.id("A1")).isDisplayed();
			System.out.println(res);//true-----visible
			
			res = driver.findElement(By.id("A3")).isDisplayed();
			System.out.println(res);//false--- not visible
			
			res=driver.findElement(By.id("A5")).isSelected();  // checkbox radio button
			System.out.println(res);//true-- checkbox selected
			
			res=driver.findElement(By.id("A6")).isSelected();  
			System.out.println(res);//false-- checkbox is not selected
			
			res=driver.findElement(By.id("A1")).isEnabled();
			System.out.println(res);//true--- enabled (we can edit)
		
			res=driver.findElement(By.id("A4")).isEnabled();
			System.out.println(res);//false--- disabled (we cant edit)
			
			driver.close();

		}
}
