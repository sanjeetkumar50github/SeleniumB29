package Class21PageLoad;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/* in Selenium we use 'Select' class to handle list box
 * it has 3 methods to select the option
 * using index,value & text (last 2 are case sensitive)
 * if argument is invalid then it will throw NSEE 
 * 
 * if the listbox tag is not <select> then we get UnexpectedTagNameException
	we can use findElements to handle the listbox whose tag is not <select>
 * 
 */
public class Demo6 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class21/class21listbox.html");
			WebElement listbox = driver.findElement(By.id("A1"));
			Thread.sleep(1000);
			listbox.click();
			Thread.sleep(1000);
			String xp="//select[@id='A1']/option";
			List<WebElement> allOptions = driver.findElements(By.xpath(xp));
			int count =allOptions.size();
			System.out.println(count);
			for(WebElement option:allOptions)
			{
				System.out.println(option.getText());
			}

			allOptions.get(1).click();
			Thread.sleep(1000);
			listbox.click();
		}
}
