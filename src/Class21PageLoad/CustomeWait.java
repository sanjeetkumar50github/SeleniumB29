package Class21PageLoad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CustomeWait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// 1 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();

		// 2
		// //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));

		// 3 Thread.sleep(7000);

//		while(true)	
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			try {
				driver.findElement(By.id("logoutLink")).click();
				System.out.println("logout link found");
				break;
			} catch (Exception e) {
				System.out.println("logout link not found");
//					Thread.sleep(500);
			}
		}

		System.out.println("End");
	}
}
