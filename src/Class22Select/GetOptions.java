package Class22Select;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("file:///C:/Users/Administrator/Desktop/Akshra%20Documents/Selenium%20class%20doc/Class22ListBox2.html");
			WebElement listbox = driver.findElement(By.id("A3"));
			Select select = new Select(listbox);
			
			WebElement first = select.getFirstSelectedOption();
			System.out.println(first.getText());
			
			//Count the number of options present in the listbox
			List<WebElement> all_options = select.getOptions();
			int count=all_options.size();
			System.out.println(count);
			
			//print all the options present in the listbox
			for(WebElement option:all_options)
			{
				System.out.println(option.getText());
			}
					
			driver.close();
		}
}