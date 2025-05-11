package Class33;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo2 {

	
	@Test
	public void testA() throws InterruptedException, MalformedURLException {
	
		ChromeOptions options = new ChromeOptions();
		options.setPlatformName("Windows 10");
		options.setBrowserVersion("latest");

		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("name", "BhanuTest");

		options.setCapability("sauce:options", sauceOptions);
		String sauceurl="";
		URL remote=new URL(sauceurl);
		WebDriver driver=new RemoteWebDriver(remote, options);

		
		
		driver.get("https://demo.actitime.com/login.do");

		for(int i=1;i<=10;i++) {
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(500);
		driver.findElement(By.id("username")).clear();
		Thread.sleep(500);
		}
		
		driver.quit();
	}

}
