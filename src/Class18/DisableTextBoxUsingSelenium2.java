package Class18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//How do enter the value even if the text box is disabled? ---using JSE
public class DisableTextBoxUsingSelenium2 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class18/class18element.html");
			Thread.sleep(2000);
			//find the element using selenium but perform the action using java script
			WebElement e = driver.findElement(By.id("A4"));
			JavascriptExecutor j=(JavascriptExecutor) driver;
			j.executeScript("arguments[0].value=arguments[1]",e,"Kumar Sanjeet");
		}
}
