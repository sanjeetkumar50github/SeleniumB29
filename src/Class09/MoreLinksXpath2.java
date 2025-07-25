package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*xpath- it is the path of the element in html tree 
 * in xpath we start with . ---> root element
 * using dot is not mandatory
 * in xpath we use / ----> child element
 * can we use index in xpath? yes , but index starts from 1
 * 
 */

public class MoreLinksXpath2 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void reset(WebDriver driver) 
	{
		try 
		{
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/Selenium%20Class%20Doc/Class9/class9twolink.html");
		driver.findElement(By.xpath("./html/body/a")).click();
		reset(driver);
		driver.findElement(By.xpath("/html/body/a[1]")).click();
		reset(driver);
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		reset(driver);
		driver.findElement(By.xpath("/html/body/a[3]")).click();

	}
}