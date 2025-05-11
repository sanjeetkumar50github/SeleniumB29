package Class18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * console.dir(document.getElementById('username'))
 */
public class DOM4 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");			
			WebElement unTB = driver.findElement(By.id("username"));
			String v1 = unTB.getDomAttribute("placeholder");
			System.out.println(v1);
			
			String html = unTB.getDomProperty("outerHTML");
			System.out.println(html);
			
			driver.close();

			
		}
}
