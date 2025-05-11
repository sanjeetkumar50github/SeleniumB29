package Class14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Class14relativeLocators {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.get("file:///F:/B29/Day14%2003-Feb-2022/table.html");

			driver.findElement(with(By.tagName("input")).toLeftOf(By.xpath("//td[.='SQL']"))).click();
	
			String cost = driver.findElement(with(By.tagName("td")).toRightOf(By.xpath("//td[.='SQL']"))).getText();
			System.out.println(cost);
			
			String sub = driver.findElement(with(By.tagName("td")).above(By.xpath("//td[.='SQL']"))).getText();
			System.out.println(sub);
			
			String sub2 = driver.findElement(with(By.tagName("td")).below(By.xpath("//td[.='SQL']"))).getText();
			System.out.println(sub2);
			
			driver.close();
			
		}
}
