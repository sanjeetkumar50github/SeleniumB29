package Class22Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDeselectAll1 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class22/Class22ListBox2.html");
			WebElement listbox = driver.findElement(By.id("A2"));
			Select select = new Select(listbox);
			Thread.sleep(1000);
			select.selectByIndex(0);
			Thread.sleep(1000);
			select.selectByValue("b");
			Thread.sleep(1000);
			select.selectByVisibleText("Snacks");
			
			Thread.sleep(1000);
			select.deselectByIndex(0);
			Thread.sleep(1000);
			select.deselectByValue("b");
			Thread.sleep(1000);
			select.deselectByVisibleText("Snacks");
			select.deselectAll();
			
			boolean is_it_multi_Select = select.isMultiple();
			System.out.println(is_it_multi_Select);
		}
}
