package Class18;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//How do enter the value even if the text box is disabled? ---using JSE
public class DisbleTextBox1 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class18/class18element.html");
			Thread.sleep(2000);
			
//			driver.findElement(By.id("A4")).sendKeys("Akshara");
			
			String code="document.getElementById('A4').value='Sanjeet'";
			JavascriptExecutor j=(JavascriptExecutor) driver;
			j.executeScript(code);
		}
}
