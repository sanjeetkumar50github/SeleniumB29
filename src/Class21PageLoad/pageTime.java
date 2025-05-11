package Class21PageLoad;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
//			driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
//			driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		driver.get("https://www.actimind.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,500)");
		/*
		 * 1. insert java script in to the browser 2. inform the browser to run the java
		 * script 3. wait till java script execution is completed and acknwoledged by
		 * browser 4. goto next step
		 */
		j.executeAsyncScript("window.scrollBy(0,500)");
		/*
		 * 1. insert java script in to the browser 
		 * 2. inform the browser to run the javascript 
		 * 3. no waiting 
		 * 4. goto next step
		 */
		System.out.println("End");
	}
}
