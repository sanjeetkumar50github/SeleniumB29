package Class06;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6Windowhandles {

	static 
	{	//set the path of driver executable
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		String w1 = driver.getWindowHandle();
		System.out.println(w1);

		
		driver.switchTo().newWindow(WindowType.WINDOW);
		String w2 = driver.getWindowHandle();
		System.out.println(w2);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		String w3 = driver.getWindowHandle();
		System.out.println(w3);
		
		
		Set<String> all_whs = driver.getWindowHandles();
		System.out.println(all_whs);
		
		Thread.sleep(1000);
		driver.quit();
	}

}
