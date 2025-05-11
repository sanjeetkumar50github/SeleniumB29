package Class33;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {

	final String d_url="http://localhost:4444",d_browser="chrome",d_x="0";
	
	@Parameters({"remoteURL","browser","strX"})
	@Test
	public void testA(@Optional(d_url) String remoteURL,@Optional(d_browser) String browser,@Optional(d_x) String strX) throws InterruptedException, MalformedURLException {
	
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName(browser);
		
		URL remote=new URL(remoteURL);
		WebDriver driver=new RemoteWebDriver(remote,cap);

		Dimension d=new  Dimension(300, 600);
		driver.manage().window().setSize(d);
		
		int x=Integer.parseInt(strX);
		Point p=new Point(x,0);
		driver.manage().window().setPosition(p);
		
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

