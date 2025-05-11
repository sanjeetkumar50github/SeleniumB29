package Class14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class Class14selectcheckboxselenium4 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.get("file:///F:/B29/Day14%2003-Feb-2022/table.html");
			
			String sql="//td[.='SQL']";
			WebElement sql_element = driver.findElement(By.xpath(sql));
			
			String checkbox="//input[@type='checkbox']";
			RelativeBy locator = RelativeLocator.with(By.xpath(checkbox)).toLeftOf(sql_element);
			
			driver.findElement(locator).click();
	
	}
}
