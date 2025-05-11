package Class26Actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop8 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws Exception{	
			
			WebDriver driver = new ChromeDriver();	
			driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
			Thread.sleep(1000);
			WebElement b1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
			WebElement b3 = driver.findElement(By.xpath("//h1[.='Block 3']"));
			Actions actions=new Actions(driver);
			actions.dragAndDrop(b1, b3).perform();
		}
}
