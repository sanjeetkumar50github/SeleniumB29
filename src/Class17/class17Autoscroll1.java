package Class17;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1. NO method in selenium to scroll the page
//2. if the page static and element is outside the visible area (somewhere down)
//     then we need not scroll the page, selenium will auto scroll

public class class17Autoscroll1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actimind.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Learn')]")).click();
	}
}
