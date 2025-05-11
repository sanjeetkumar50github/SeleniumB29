package Class32;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	
	@Parameters({"browser","strX"})
	@Test
	public void testA(@Optional("chrome") String browser,@Optional("0") String strX) throws InterruptedException {
			WebDriver driver ;
			if(browser.equals("chrome"))
			{
				driver=new ChromeDriver();
			}
			else
			{
				driver =new FirefoxDriver();
			}


			Dimension d=new  Dimension(300, 600);
			driver.manage().window().setSize(d);
			
			int x=Integer.parseInt(strX);
			Point p=new Point(x,0);
			driver.manage().window().setPosition(p);
			
			driver.get("https://demo.actitime.com/login.do");

			
			for(int i=1;i<=10;i++) {
			driver.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(500);
			driver.findElement(By.id("username")).clear();
			Thread.sleep(500);
			}
			
			driver.quit();
	}
}

