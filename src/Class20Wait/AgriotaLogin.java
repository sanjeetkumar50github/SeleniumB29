package Class20Wait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgriotaLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("http://3i-infotech.net/digital/qaenv/login");
		String ExpectedpageTitle = "Agriota | Login";
		System.out.println(ExpectedpageTitle);
		String actualTitle = driver.getTitle();
		if (ExpectedpageTitle.equals(actualTitle)) {
			System.out.println("Pass:Yes this Agriota Login Page");
		} else
			System.out.println("Fail");
		driver.findElement(By.xpath("//input[@formcontrolname='userId']"))
				.sendKeys("skfacilityprovideradminqa12@yopmail.com");
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Admin@2001");
		driver.findElement(By.id("signInButton")).click();
		Thread.sleep(3000);
		String msg=driver.findElement(By.xpath("//*[contains(text(),'has been sent to registered Email Address')]")).getText();	
			System.out.println(msg);
			
			
		

	

		

}
}
		