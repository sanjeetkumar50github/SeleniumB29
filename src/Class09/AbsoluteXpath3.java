package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*xpath- it is the path of the element in html tree 
 * in xpath we start with . ---> root element
 * using dot is not mandatory
 * in xpath we use / ----> child element
 * can we use index in xpath? yes , but index starts from 1
 * absolute xpath
 * relative xpath
 */

public class AbsoluteXpath3 {

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
		driver.findElement(By.xpath(".//a")).click();//1st link FB
		reset(driver);
		driver.findElement(By.xpath(".//a[1]")).click();//1st link FB
		reset(driver);
		driver.findElement(By.xpath(".//a[2]")).click();//2nd link google


		

	}
}
