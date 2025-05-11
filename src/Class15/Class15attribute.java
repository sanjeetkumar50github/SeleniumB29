package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class15attribute {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			WebElement element = driver.findElement(By.id("keepLoggedInCheckBox"));
			
			String tag=element.getTagName();
			System.out.println(tag);
			
			String type=element.getAttribute("type");
			System.out.println(type);
			
			String ttt=element.getAttribute("title");
			System.out.println(ttt);	
			
			String text=driver.findElement(By.id("toPasswordRecoveryPageLink")).getText();
			System.out.println(text);
			
			driver.close();
		}
}
