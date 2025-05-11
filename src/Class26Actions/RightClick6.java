package Class26Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Right click --context click--Context Menu
public class RightClick6 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws Exception{	
			
			WebDriver driver = new ChromeDriver();	
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			Thread.sleep(1000);
			WebElement btn = driver.findElement(By.xpath("//span[.='right click me']"));
			
			Actions actions=new Actions(driver);
			actions.contextClick(btn).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[.='Copy']")).click();
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
			Thread.sleep(1000);
			driver.close();
		}
}
