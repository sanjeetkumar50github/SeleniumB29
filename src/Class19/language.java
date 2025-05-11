package Class19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Count the number of links present on google page and print the text
public class language {
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
				String eText="ಕನ್ನಡ";
				if(linktext.equals(eText))
				{
					System.out.println("Found");
				}
			}
		
		}
}
