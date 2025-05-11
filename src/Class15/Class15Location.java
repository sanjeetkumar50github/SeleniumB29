package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Class15Location {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			WebElement unTB = driver.findElement(By.id("username"));
			
			int x=unTB.getLocation().getX();
			int y=unTB.getLocation().getY();
			System.out.println("x:"+x);
			System.out.println("y:"+y);
			
			int h=unTB.getSize().getHeight();
			int w=unTB.getSize().getWidth();
			System.out.println("h:"+h);
			System.out.println("w:"+w);
			
			
			x=unTB.getRect().getX();
			y=unTB.getRect().getY();
			h=unTB.getRect().getHeight();
			w=unTB.getRect().getWidth();
			System.out.println("x:"+x);
			System.out.println("y:"+y);
			System.out.println("h:"+h);
			System.out.println("w:"+w);
			
			driver.close();
		}
}
