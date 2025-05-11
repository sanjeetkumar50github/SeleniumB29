package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8ActitimeLogin5 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	//Login to acti time app using css Selector
	public static void main(String[] args) throws InterruptedException {

		//open the browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("https://demo.actitime.com/login.do");
		//enter valid user name
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		//enter the valid password
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		//click on login button
		driver.findElement(By.cssSelector("#loginButton")).click();
		//wait and get the title
		Thread.sleep(5000);
		//check point
		String actual_title=driver.getTitle();
		System.out.println("Actual: "+actual_title);
		
		String expected_title="actiTIME - Enter Time-Track";
		System.out.println("Expected: "+expected_title);
		
		if(actual_title.equals(expected_title))
		{
			System.out.println("Pass:Login is successful");
		}
		else
		{
			System.err.println("Fail:Login is NOT successful");
		}
		driver.close();
	}
}
