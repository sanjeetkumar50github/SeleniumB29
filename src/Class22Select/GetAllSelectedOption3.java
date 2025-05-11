package Class22Select;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOption3 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class22/Class22ListBox2.html");
			WebElement listbox = driver.findElement(By.id("A3"));
			Select select = new Select(listbox);
			List<WebElement> all_selected = select.getAllSelectedOptions();
			int count = all_selected.size();
			System.out.println(count);
			
//			for(int i=0;i<count;i++) {
//				WebElement option = all_selected.get(i);
//				String text=option.getText();
//				System.out.println(text);
//			}
			
			for(WebElement selected:all_selected)
			{
				System.out.println(selected.getText());
			}
			
			driver.close();
		}
}
