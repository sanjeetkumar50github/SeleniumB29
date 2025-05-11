package Class19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//How do enter the value even if the text box is disabled? ---using JSE
public class ForEachFindElements3 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class19/class19table.html");
			List<WebElement> allInputs = driver.findElements(By.xpath("//input"));	
			int count= allInputs.size();
			
//			for(int i=0;i<count;i++) {
//				allInputs.get(i).sendKeys("bhanu");
//				Thread.sleep(1000);
//			}
			
			for(WebElement input:allInputs)
			{
				input.sendKeys("bhanu");
				Thread.sleep(1000);
			}
			
			for(int i=count-1;i>=0;i--) {
				allInputs.get(i).clear();
				Thread.sleep(1000);
			}
		}
}

