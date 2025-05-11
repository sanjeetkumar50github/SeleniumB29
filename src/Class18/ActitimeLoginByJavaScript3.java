package Class18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//How do enter the value even if the text box is disabled? ---using JSE
public class ActitimeLoginByJavaScript3 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			
			JavascriptExecutor j=(JavascriptExecutor) driver;
			
			WebElement unTB = driver.findElement(By.id("username"));
			j.executeScript("arguments[0].value=arguments[1]",unTB,"admin");
			
			WebElement pwTB =  driver.findElement(By.name("pwd"));
			j.executeScript("arguments[0].value=arguments[1]",pwTB,"manager");
			
			WebElement loginBTN = driver.findElement(By.xpath("//div[.='Login ']"));
			j.executeScript("arguments[0].click()",loginBTN);
			
		}
}
