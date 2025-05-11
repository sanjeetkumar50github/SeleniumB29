package Class22Select;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrraped5 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			//print the content of the listbox without using looping statement
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class22/Class22ListBox2.html");
			WebElement listbox = driver.findElement(By.id("A2"));
			Select select=new Select(listbox);
//			List<WebElement> allOptions = select.getOptions();
//			for(WebElement option:allOptions)
//			{
//				System.out.println(option.getText());
//			}
			
//			WebElement option = select.getWrappedElement();
//			System.out.println(option.getText());
			
			System.out.println(select.getWrappedElement().getText());
			
			driver.close();
		}
}
