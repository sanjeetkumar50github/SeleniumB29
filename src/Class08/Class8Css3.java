package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//[id='a1'][name='n1']
//means
//id should be 'a1' AND name should be 'n1'

//[id='a1'],[name='n1']
//means
//id should be 'a1' OR  name should be 'n1'

//a[id='a1']--- a#a1  ---- # means id
//a[class='c1']--- a.c1  ---- . means class
public class Class8Css3 {

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
		driver.get("file:///D:/Selenium%20Class%20Doc/Class8/demo2.html");
		driver.findElement(By.cssSelector("a[id='a1']")).click();
		reset(driver);
		driver.findElement(By.cssSelector("a[id=\"a1\"]")).click();
		reset(driver);
		driver.findElement(By.cssSelector("[id='a1'][name='n1']")).click();
		reset(driver);
		driver.findElement(By.cssSelector("[id='a1'],[name='n1']")).click();
		reset(driver);
		driver.findElement(By.cssSelector("a#a1")).click();
		reset(driver);
		driver.findElement(By.cssSelector("#a1")).click();
		reset(driver);
		driver.findElement(By.cssSelector("a.c1")).click();
		reset(driver);
		driver.findElement(By.cssSelector(".c1")).click();
		reset(driver);
		driver.close();
		
	}
}
