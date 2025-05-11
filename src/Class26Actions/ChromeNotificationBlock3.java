package Class26Actions;


import java.time.Duration;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Notification popup
public class ChromeNotificationBlock3 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws Exception{	
			HashMap<String,Integer> prefs=new HashMap<String,Integer>();
			//1 for allow , 2 for block notification
			prefs.put("profile.default_content_setting_values.notifications", 2);
			
			ChromeOptions options=new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			
			WebDriver driver =new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://pushalert.co/demo");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.id("send-button")).click();
			Thread.sleep(2000);
			String msg=driver.findElement(By.id("pa_class-blocked-info")).getText();
			System.out.println(msg);
			driver.close();
		}
}
