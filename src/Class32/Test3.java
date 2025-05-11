package Class32;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void testA() throws InterruptedException, MalformedURLException {
			URL remoteAddress=new URL("http://127.0.0.1:4444");
			DesiredCapabilities browser=new DesiredCapabilities();
			browser.setBrowserName("chrome");
			WebDriver driver=new RemoteWebDriver(remoteAddress, browser);
			driver.get("https://demo.actitime.com/login.do");
			
	}
}
