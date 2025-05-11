package Class24PopUp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

//HTML popup -Hidden Division popup
//solution -- findElement
public class NewWindow {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			
			WebDriver driver =new ChromeDriver();
			
			Thread.sleep(1000);
			
//			driver.switchTo().newWindow(WindowType.TAB);
			
			
			Thread.sleep(1000);
			
			driver.switchTo().newWindow(WindowType.WINDOW);
			
			driver.get("https://www.google.com");
			
			Thread.sleep(1000);
			
			driver.quit();
		}
}
