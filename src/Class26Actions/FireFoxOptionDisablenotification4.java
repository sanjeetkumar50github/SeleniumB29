package Class26Actions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

//Notification popup in firefox
public class FireFoxOptionDisablenotification4 {
	static 
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
		public static void main(String[] args) throws Exception{	
			FirefoxOptions options=new FirefoxOptions();
			options.addPreference("permissions.default.desktop-notification",2);
			WebDriver driver =new FirefoxDriver(options);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			
			driver.get("https://pushalert.co/demo");
			
			Thread.sleep(2000);
			driver.findElement(By.id("send-button")).click();
			
			Thread.sleep(2000);
			String msg=driver.findElement(By.id("pa_class-blocked-info")).getText();
			System.out.println(msg);
			driver.close();
		}
}
