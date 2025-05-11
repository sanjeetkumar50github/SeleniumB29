package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class15click {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class15/class15Element.html");
			Thread.sleep(1000);
			driver.findElement(By.id("A1")).clear();//for textbox or password
			Thread.sleep(1000);
			driver.findElement(By.id("A1")).sendKeys("Akshara");
			Thread.sleep(1000);
			driver.findElement(By.id("A7")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("A8")).submit();
		}
}
