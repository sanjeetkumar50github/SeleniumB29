package Class14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class class14relativelctrs {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class14/class14leftbox.html");

			System.out.println("Left of SQL is Check box:click it");
			driver.findElement(with(By.tagName("input")).toLeftOf(By.xpath("//td[.='SQL']"))).click();
	
			String cost = driver.findElement(with(By.tagName("td")).toRightOf(By.xpath("//td[.='SQL']"))).getText();
			System.out.println("Right of SQL is cost:"+cost);
			
			String sub = driver.findElement(with(By.tagName("td")).above(By.xpath("//td[.='SQL']"))).getText();
			System.out.println("Above the SQL is previous subject:"+sub);
			
			String sub2 = driver.findElement(with(By.tagName("td")).below(By.xpath("//td[.='SQL']"))).getText();
			System.out.println("Below the SQL is Next subject:"+sub2);
			
			driver.close();
			
		}
}
