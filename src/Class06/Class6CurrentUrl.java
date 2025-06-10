package Class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6CurrentUrl {

	static 
	{	//set the path of driver executable
		System.setProperty("webdriver.chrome.driver","./driver/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		//Open the chrome browser
		WebDriver driver =new ChromeDriver();
		//enter the url fb.com
		driver.get("http://www.fb.com");
		Thread.sleep(4000);
		//Maximize the window
		driver.manage().window().maximize();
		//get the current url from the address bar
		String current_url = driver.getCurrentUrl();
		//print it
		System.out.println("current_url:"+current_url);
		//Specify the expected url
		String expected_url="https://www.facebook.com/";
		//print it
		System.out.println("expected_url:"+expected_url);
		//compare expected with actual value & report the status
		if(current_url.equals(expected_url))
		{
			System.out.println("PASS: URL is matching");
		}
		else
		{
			System.out.println("FAIL: URL is not matching");
		}
		//close the browser
		//driver.quit();
	}

}
