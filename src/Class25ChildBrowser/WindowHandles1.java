package Class25ChildBrowser;


import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Alert popup
public class WindowHandles1 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			WebDriver driver =new ChromeDriver();
			
			String w1 = driver.getWindowHandle();
			System.out.println(w1);
			
			driver.get("file:///D:/Selenium%20Class%20Doc/Class25/class25parent.html");
			driver.findElement(By.id("a1")).click();
			Thread.sleep(1000);
			
			Set<String> w2 = driver.getWindowHandles();
			int count=w2.size();
			System.out.println(count);
			
			for(String w:w2)
			{
				System.out.println(w);
			}
			
			driver.quit();
						
		}
}
