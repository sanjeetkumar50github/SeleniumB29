package Class32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/*can we send data from testng xml file?
 * -->yes
 * How? 
 * using <parameter>
 * 
 * <parameter>  has 2 attributes
 * name & value
 * 
 * How to receive it in Test class?
 * using @Parameters
 * 
 * If the value is not available we get TestNGException
 * We can use @Optional to define default value
 */
public class Test1 {
	final String a="https://demo.actitime.com";
	final String b="ADMIN";
	final String c="manager";
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Parameters({"url","un","pw"})
	@Test
	public void testA(@Optional(a)String url,@Optional(b)String un,@Optional(c)String pw) {
			WebDriver driver =new ChromeDriver();
			driver.get(url);
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
}