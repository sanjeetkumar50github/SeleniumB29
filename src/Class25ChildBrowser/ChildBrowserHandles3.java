package Class25ChildBrowser;


import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Alert popup
public class ChildBrowserHandles3 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class25/class25parent.html");
			driver.findElement(By.id("a1")).click();
			Thread.sleep(1000);
			
			String wh = driver.getWindowHandle();
			Set<String> allWHS = driver.getWindowHandles();
			allWHS.remove(wh);
			for(String w:allWHS)
			{
				driver.switchTo().window(w).close();
			}
			
//			//close specific browser
//			for(String w:allWHS)
//			{
//				driver.switchTo().window(w);
//				String title=driver.getTitle();
//				System.out.println(title);
//				if(title.equals("Akshara"))
//				{
//					driver.close();
//				}
//				Thread.sleep(1000);
//			}
			
						
		}
}
