package Class20Wait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Application will be slow but selenium will be fast---> we get NSEE
//we try to match selenium speed with application speed-->synchronization
//Thread.sleep(9000);-- blind wait
//it just waits for n seconds without checking any condition
//it waits exactly for n seconds even if element is present
//we should write multiple sleep statements where ever app is slow
public class ImplicitlyWait {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			//open the browser
			WebDriver driver =new ChromeDriver();
			
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //selenium 3
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //selenium 4
			
			Duration time = driver.manage().timeouts().getImplicitWaitTimeout(); //selenium 4
			System.out.println(time);
			
			//Enter the URL
			driver.get("https://demo.actitime.com/login.do");
			//Enter the User name
			driver.findElement(By.id("username")).sendKeys("admin");
			//Enter the password
			driver.findElement(By.name("pwd")).sendKeys("manager");
			//click login button
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			//click logout link
			driver.findElement(By.id("logoutLink")).click();
			//close the browser
			driver.close();
		}
}

