package Class22Select;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class22/Class22ListBox2.html");
			
			List<WebElement> all_listbox = driver.findElements(By.xpath("//select"));
			
			for(WebElement listbox:all_listbox)
			{
				String  id=listbox.getAttribute("id");
				System.out.println("ListBox is:"+id);
				
				Select select = new Select(listbox);
				
		
					try {
						WebElement first = select.getFirstSelectedOption();
						System.out.println("First Selected Option:"+first.getText());
					}
					catch (Exception e) {
						System.out.println("No option selected");
					}
					//Count the number of options present in the listbox
					List<WebElement> all_options = select.getOptions();
					int count=all_options.size();
					System.out.println("Total No. Of Options:"+count);
				
				
					//print all the options present in the listbox
					System.out.println("content of the list box");
					System.out.println("------------------------");	
					for(WebElement option:all_options)
					{
							System.out.println(option.getText());
					}
					System.out.println("------------------------");	
			}
			
			driver.close();
		}
}
