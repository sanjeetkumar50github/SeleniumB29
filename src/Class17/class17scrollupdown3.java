package Class17;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1. NO method in selenium to scroll the page
//2. if the page static and element is outside the visible area (somewhere down)
//   then we need not scroll the page, selenium will auto scroll
// 3. we use javascript to scroll the page
// 4. How to run JS manually?
//--> open dev toolbar (F12) , goto 'Console' type js code alert('hi') and press enter
//5. How to run JS from selenium?--using executeScript method of JavascriptExecutor interface

public class class17scrollupdown3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actimind.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		// Scroll down
		for (int i = 1; i <= 5; i++) {
			j.executeScript("window.scrollBy(0,300)");
			Thread.sleep(1000);
		}
		// Scroll Up
		for (int i = 1; i <= 5; i++) {
			j.executeScript("window.scrollBy(0,-300)");
			Thread.sleep(1000);
		}
	}
}
