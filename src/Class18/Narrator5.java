package Class18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * console.dir(document.getElementById('username'))
 */
public class Narrator5 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");			
			WebElement unTB = driver.findElement(By.id("username"));
			String name = unTB.getAccessibleName();
			String role = unTB.getAriaRole();
			System.out.println(name+" "+role);
			driver.close();
			
		}
}
