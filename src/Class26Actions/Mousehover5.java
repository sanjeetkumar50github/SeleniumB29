package Class26Actions;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//Notification popup in firefox
public class Mousehover5 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws Exception{	
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			
			driver.get("https://www.actimind.com/");
			
			WebElement menu = driver.findElement(By.xpath("//a[contains(.,'AREAS OF EXPERTISE')]"));
			Actions actions=new Actions(driver);
			actions.moveToElement(menu).perform(); //mouse hover
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[.='Web Crawling']")).click();
		}
}
