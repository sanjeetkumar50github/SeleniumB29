package Class25ChildBrowser;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.linkText("actiTIME Inc.")).click();
			Thread.sleep(5000);
			Set<String> allWHS = driver.getWindowHandles();
			
			for(String w:allWHS)
			{
				driver.switchTo().window(w);
				
			}
			
			System.out.println(driver.getTitle());
			driver.findElement(By.linkText("Try Free")).click();
			Thread.sleep(2000);
			driver.close();

		}
}

