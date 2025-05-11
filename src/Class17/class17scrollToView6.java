package Class17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1. NO method in selenium to scroll the page
//2. if the page static and element is outside the visible area (somewhere down)
//   then we need not scroll the page, selenium will auto scroll
// 3. we use javascript to scroll the page
// 4. How to run JS manually?
//--> open dev toolbar (F12) , goto 'Console' type js code alert('hi') and press enter
//5. How to run JS from selenium?--using executeScript method of JavascriptExecutor interface

public class class17scrollToView6 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// Scroll-bar inside the page
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://news.google.com/");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//span[.='Health']"));

		JavascriptExecutor j = (JavascriptExecutor) driver;

		j.executeScript("arguments[0].scrollIntoView()", element);

	}
}
