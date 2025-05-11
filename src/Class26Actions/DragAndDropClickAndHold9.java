package Class26Actions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropClickAndHold9 {
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
			//HOW TO DRAG & DROP without using dragAndDrop method???- composite action
			actions.clickAndHold(b1).moveToElement(b3).pause(Duration.ofSeconds(2)).release().perform();
		}
}
