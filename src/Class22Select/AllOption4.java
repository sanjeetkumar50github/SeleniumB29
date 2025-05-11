package Class22Select;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOption4 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class22/Class22ListBox2.html");
			String[] loc_values= {"A1","A2","A3"};
			for(int i=0;i<3;i++)
			{
//				String loc_value="A"+i;

				System.out.println("ListBox:"+loc_values[i]);
				WebElement listbox = driver.findElement(By.id(loc_values[i]));
				Select select = new Select(listbox);
				
				try 
				{
					WebElement first = select.getFirstSelectedOption();
					System.out.println("First Selected Option:"+first.getText());
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
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
