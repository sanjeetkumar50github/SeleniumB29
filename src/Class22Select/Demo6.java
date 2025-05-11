package Class22Select;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			//print the content of list box in sorted order
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class22/Class22ListBox2.html");

			WebElement listbox = driver.findElement(By.id("A2"));
			Select select=new Select(listbox);
			
			List<WebElement> allOptions = select.getOptions();
			
			List<String> allText= new ArrayList<String>();
			
			for(WebElement option:allOptions)
			{
				String text=option.getText();
				allText.add(text);
			}

			Collections.sort(allText);
			//which type of object can be sort.
			//any object whose class implements-comparable interface
			//ex-string and all the wrapper classes such as Integer
			
			for(String text:allText)
			{
				System.out.println(text);
			}
			
			driver.close();
		}
}

