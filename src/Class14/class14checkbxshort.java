package Class14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class class14checkbxshort {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class14/class14leftbox.html");

			driver.findElement(with(By.xpath("//input[@type='checkbox']")).toLeftOf(By.xpath("//td[.='SQL']"))).click();
	
	}
}
