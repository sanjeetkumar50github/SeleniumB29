package Class19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//How do enter the value even if the text box is disabled? ---using JSE
public class GoogleLinks4 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.get("http://www.google.com");
			List<WebElement> allLinks = driver.findElements(By.xpath("//a"));	
			int count= allLinks.size();
			System.out.println(count);
			
			for(int i=0;i<count;i++) {
				String linktext = allLinks.get(i).getText();
				System.out.println(linktext);
			}
		
		}
}
