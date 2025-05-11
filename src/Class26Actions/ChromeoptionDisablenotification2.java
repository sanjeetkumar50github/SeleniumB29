package Class26Actions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Notification popup
public class ChromeoptionDisablenotification2 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws Exception{	
			ChromeOptions options=new ChromeOptions();
			//hide the notification popup 
			options.addArguments("--disable-notifications");
			WebDriver driver =new ChromeDriver(options);
			driver.get("https://www.irctc.co.in/");
			//Note this will neither click 'allow' nor click 'block'
		}
}
