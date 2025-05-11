package Class19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Count the number of links present on google page and print the text
public class SelectCheckBox5 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class19/class19list.html");
			List<WebElement> allChkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
			for(WebElement chkBox:allChkBox)
			{
				chkBox.click();
			}
			
			List<WebElement> alternativeChkBox = driver.findElements(By.xpath("(//input[@type='checkbox'])[position() mod 2=0]"));
			for(WebElement chkBox:alternativeChkBox)
			{
				chkBox.click();
			}
			
		
		
		}
}