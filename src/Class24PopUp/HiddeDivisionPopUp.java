package Class24PopUp;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//HTML popup -Hidden Division popup
//solution -- findElement
public class HiddeDivisionPopUp {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class24/class24PopUpDemo.html");
			Thread.sleep(1000);
			driver.findElement(By.id("A4")).click();
			Thread.sleep(1000);
			driver.switchTo().activeElement().sendKeys("bhanu");
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys("bhanu123");
//			driver.findElement(By.xpath("//button[text()='✕']")).click();	
			driver.findElement(By.xpath("(//button)[2]")).click();
		}
}
