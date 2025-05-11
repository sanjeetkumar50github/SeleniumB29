package Class16;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotForElement1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement e = driver.findElement(By.cssSelector(".atLogoImg"));
		File img = e.getScreenshotAs(OutputType.FILE);
		String path = img.getAbsolutePath();
		System.out.println(path);
		Thread.sleep(3000);
		driver.close();

	}
}
