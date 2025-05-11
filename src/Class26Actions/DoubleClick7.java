package Class26Actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*Drop down listbox---Select class
 * Drop Down Menu -Actions class
 * Context Menu -Actions class
 *  
 */
public class DoubleClick7 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws Exception{	
			
			WebDriver driver = new ChromeDriver();	
			driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");
			Thread.sleep(1000);
			WebElement btn = driver.findElement(By.xpath("//input[@value='Double Click']"));
			Actions actions=new Actions(driver);
			actions.doubleClick(btn).perform();
			
			//write code to print the msg & color
		}
}
