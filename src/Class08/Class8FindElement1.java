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
 * 5. linkText
 * 6. partialLinkText
 * 7. cssSelector
 * 8. xpath
 * 
 *if locator is matching with multiple elements,then find elements returns address of first matching web elements
 *
 * if not matching,then find elements throw no such elements exception.
 * 
 */
public class Class8FindElement1 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/Selenium%20Class%20Doc/Class8/demo.html");
		
		//one match- returns address of the matching element and perform the action
		driver.findElement(By.tagName("input")).sendKeys("bhanu");
		
//		WebElement element = driver.findElement(By.tagName("a"));
//		element.click();
		
		//multiple match -returns address of the 1st matching element and perform the action
		driver.findElement(By.tagName("a")).click();
		
		//no matching element- throw NSEE
		driver.findElement(By.tagName("bhanu")).click();
		
	}
}
