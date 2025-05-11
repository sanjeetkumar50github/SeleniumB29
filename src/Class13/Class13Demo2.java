package Class13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * PLEASE WRITE LOGIN CODE FOR YOUR CURRENT APPLICATION
 * 
 */

public class Class13Demo2 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			//open the browser
			WebDriver driver =new ChromeDriver();
			//enter the url
			driver.get("https://opensource-demo.orangehrmlive.com/");
			//enter valid user name
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			//enter valid password
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			//click on login button
			driver.findElement(By.id("btnLogin")).click();
			
			//wait for 3s
			Thread.sleep(3000);
			
			//verify that home page is displayed (check the title)
			String expected_url="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
			String actual_url=driver.getCurrentUrl();
			if(actual_url.equals(expected_url)) {
				System.out.println("PASS: Home Page is Displayed");
			}
			else
			{
				System.out.println("FAIL: Home Page is NOT Displayed");
			}
			
			Thread.sleep(1000);
			//close the browser
			driver.close();
			
	
	}
}
