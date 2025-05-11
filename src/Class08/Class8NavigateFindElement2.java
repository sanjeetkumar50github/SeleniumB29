package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*In Selenium before performing any action(click enter select get data) on the element
 *  , we should find it(search it or locate it)
 * 
 * to search the element we use 'locators', in selenium we have 8 locators
 * 1. tagName
 * 2. id
 * 3. name
 * 4. className
 * 	5. linkText
 * 	6. partialLinkText
 * 7. cssSelector
 * 8. xpath
 * 
 * Note: if locator is matching with multiple elements , then findElement returns address of
 * 1st matching web element
 * 
 * if locator is not matching with any element, then findElement throws NoSuchElementException
 * 
 * 
 */
public class Class8NavigateFindElement2 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void reset(WebDriver driver) 
	{
		try 
		{
			Thread.sleep(500);
			driver.navigate().back();
			Thread.sleep(500);
		}
		catch (Exception e)
		{
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/Selenium%20Class%20Doc/Class8/demo2.html");
		driver.findElement(By.tagName("a")).click();
		reset(driver);
		driver.findElement(By.id("a1")).click();
		reset(driver);
		driver.findElement(By.name("n1")).click();
		reset(driver);
		driver.findElement(By.className("c1")).click();
		reset(driver);
		driver.findElement(By.linkText("Search")).click();
		reset(driver);
		driver.findElement(By.partialLinkText("Sea")).click();
		
	}
}
