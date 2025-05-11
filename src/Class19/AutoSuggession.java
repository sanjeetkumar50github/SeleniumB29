package Class19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//Count the number of links present on google page and print the text
public class AutoSuggession {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);
			//WebDriver driver =new ChromeDriver();
			driver.get("https://www.google.com/");
//			driver.switchTo().activeElement().sendKeys("java");
			driver.findElement(By.name("q")).sendKeys("selenium");
			Thread.sleep(1000);
			
			String xp="//span[contains(.,'selenium')]";
			List<WebElement> allASE = driver.findElements(By.xpath(xp));
			
			int count=allASE.size();
			System.out.println("Num of Auto Suggestions:"+count);
			
			for(WebElement ase:allASE) {
				System.out.println(ase.getText());
			}
			
			Thread.sleep(1000);
//			allASE.get(0).click();
			
//			allASE.get(count-1).click();
			
			for(WebElement ase:allASE) {
				String text=ase.getText();
				if(text.equals("selenium 30")) {
					ase.click();
					break;
				}
			}
		}
}
