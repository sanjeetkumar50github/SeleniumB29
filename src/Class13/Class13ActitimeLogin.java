package Class13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*Login script to actitime
 * 
 * 
 */

public class Class13ActitimeLogin {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			//open the browser
			WebDriver driver =new ChromeDriver();
			//enter the url
			driver.get("https://demo.actitime.com/login.do");
			//enter valid user name
			driver.findElement(By.id("username")).sendKeys("admin");
			//enter valid password
			driver.findElement(By.name("pwd")).sendKeys("manager");
			//click on login button
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			
			//wait for 3s
			Thread.sleep(3000);
			
			//verify that home page is displayed (check the title)
			String expected_title="actiTIME - Enter Time-Track";
			String actual_title=driver.getTitle();
			if(actual_title.equals(expected_title)) {
				System.out.println("PASS: Home Page is Displayed");
				driver.findElement(By.id("logoutLink")).click();
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
