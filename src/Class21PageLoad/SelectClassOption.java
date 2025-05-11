package Class21PageLoad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/* in Selenium we use 'Select' class to handle list box
 * it has 3 methods to select the option
 * using index,value & text (last 2 are case sensitive)
 * if argument is invalid then it will throw NSEE 
 * 
 * 
 */
public class SelectClassOption {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class21/class21listbox.html");
			WebElement listbox = driver.findElement(By.id("A1"));
			Select select=new Select(listbox);
			Thread.sleep(1000);
			select.selectByIndex(1);
			Thread.sleep(1000);
			select.selectByValue("c");
			Thread.sleep(1000);
			select.selectByVisibleText("Delhi");
		}
}
