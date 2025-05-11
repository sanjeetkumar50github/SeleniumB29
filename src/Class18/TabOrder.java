package Class18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Check the tab order
 */
public class TabOrder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement e1 = driver.switchTo().activeElement();
		Thread.sleep(1000);
		String n1 = e1.getAttribute("name");
		System.out.println(n1);

		e1.sendKeys(Keys.TAB);
		Thread.sleep(1000);

		WebElement e2 = driver.switchTo().activeElement();
		String n2 = e2.getAttribute("name");
		System.out.println(n2);

		Thread.sleep(1000);
		driver.close();
	}
}