package Class19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//How do enter the value even if the text box is disabled? ---using JSE
public class FindElements1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Selenium%20Class%20Doc/Class19/class19table.html");
//			WebElement e = driver.findElement(By.tagName("input"));
//			e.sendKeys("bhanu");
		List<WebElement> allElements = driver.findElements(By.tagName("bhanu"));
		int count = allElements.size();
		System.out.println(count);
		WebElement e = allElements.get(0);
		e.sendKeys("bhanu");
		allElements.get(1).sendKeys("Sanjeet");

	}
}
