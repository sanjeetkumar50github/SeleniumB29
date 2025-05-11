package Class20Wait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
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
public class BothWait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		} catch (TimeoutException e) {
			System.out.println("Explicit wait not enough");
			try {
				driver.findElement(By.id("logoutLink")).click();
			} catch (NoSuchElementException e1) {
				System.out.println("Implicit wait not enough");
			}
		}
	}
}
