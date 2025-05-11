package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Class15ValidationColour {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			WebElement errMsg = driver.findElement(By.xpath("//span[contains(.,'invalid')]"));
			System.out.println(errMsg.getText());
			
			String c = errMsg.getCssValue("color");
			System.out.println(c);
			String hexColor=Color.fromString(c).asHex();
			System.out.println(hexColor);
			
			System.out.println(errMsg.getCssValue("font-size"));
			System.out.println(errMsg.getCssValue("font-family"));
			 
			driver.close();
			
   }
}
