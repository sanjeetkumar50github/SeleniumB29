package Class25ChildBrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowsertitle4 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class25/class25parent.html");
			
			driver.findElement(By.id("a1")).click();			
			Set<String> allWHS = driver.getWindowHandles();
			
			for(String w:allWHS)
			{
				driver.switchTo().window(w);
				String title=driver.getTitle();
				if(title.equals("Akshara"))
				{
					driver.findElement(By.id("t1")).sendKeys(title);
				}
				else if(title.equals("Swara")) 
				{
					driver.findElement(By.id("t2")).sendKeys(title);
				}
				
				
			}
			
//			driver.close();//what this does??
						
		}
}