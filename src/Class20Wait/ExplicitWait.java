package Class20Wait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Application will be slow but selenium will be fast---> we get NSEE
//we try to match selenium speed with application speed-->synchronization
//Thread.sleep(9000);-- blind wait
//it just waits for n seconds without checking any condition
//it waits exactly for n seconds even if element is present
//we should write multiple sleep statements where ever app is slow
public class ExplicitWait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // selenium 4
		// Enter the URL
		driver.get("https://demo.actitime.com/login.do");
		// Enter the User name
		driver.findElement(By.id("username")).sendKeys("admin");
		// Enter the password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		// click login button
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		//implicitywait can handle all the methods at a time where explicitwait handle only one at a time

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.titleContains("Enter"));
		System.out.println(driver.getTitle());

		driver.findElement(By.id("logoutLink")).click();

		wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println(driver.getTitle());

	}
}
